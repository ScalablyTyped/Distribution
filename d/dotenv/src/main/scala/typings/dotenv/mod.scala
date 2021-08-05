package typings.dotenv

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dotenv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def config(): DotenvConfigOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[DotenvConfigOutput]
  inline def config(options: DotenvConfigOptions): DotenvConfigOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[DotenvConfigOutput]
  
  @JSImport("dotenv", "load")
  @js.native
  val load: js.Function1[/* options */ js.UndefOr[DotenvConfigOptions], DotenvConfigOutput] = js.native
  
  inline def parse(src: String): DotenvParseOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[DotenvParseOutput]
  inline def parse(src: String, options: DotenvParseOptions): DotenvParseOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DotenvParseOutput]
  inline def parse(src: Buffer): DotenvParseOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[DotenvParseOutput]
  inline def parse(src: Buffer, options: DotenvParseOptions): DotenvParseOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DotenvParseOutput]
  
  trait DotenvConfigOptions extends StObject {
    
    /**
      * You may turn on logging to help debug why certain keys or values are not being set as you expect.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * You may specify the encoding of your file containing environment variables.
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * You may specify a custom path if your file containing environment variables is located elsewhere.
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object DotenvConfigOptions {
    
    inline def apply(): DotenvConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvConfigOptions]
    }
    
    extension [Self <: DotenvConfigOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait DotenvConfigOutput extends StObject {
    
    var error: js.UndefOr[Error] = js.undefined
    
    var parsed: js.UndefOr[DotenvParseOutput] = js.undefined
  }
  object DotenvConfigOutput {
    
    inline def apply(): DotenvConfigOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvConfigOutput]
    }
    
    extension [Self <: DotenvConfigOutput](x: Self) {
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setParsed(value: DotenvParseOutput): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      inline def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    }
  }
  
  trait DotenvParseOptions extends StObject {
    
    /**
      * You may turn on logging to help debug why certain keys or values are not being set as you expect.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
  }
  object DotenvParseOptions {
    
    inline def apply(): DotenvParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvParseOptions]
    }
    
    extension [Self <: DotenvParseOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  type DotenvParseOutput = StringDictionary[String]
}
