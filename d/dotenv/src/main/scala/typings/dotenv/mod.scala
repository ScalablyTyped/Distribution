package typings.dotenv

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dotenv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def config(): DotenvConfigOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[DotenvConfigOutput]
  inline def config(options: DotenvConfigOptions): DotenvConfigOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[DotenvConfigOutput]
  
  inline def parse[T /* <: DotenvParseOutput */](src: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def parse[T /* <: DotenvParseOutput */](src: Buffer): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[T]
  
  trait DotenvConfigOptions extends StObject {
    
    /**
      * Default: `false`
      *
      * Turn on logging to help debug why certain keys or values are not being set as you expect.
      *
      * example: `require('dotenv').config({ debug: process.env.DEBUG })`
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: `utf8`
      *
      * Specify the encoding of your file containing environment variables.
      *
      * example: `require('dotenv').config({ encoding: 'latin1' })`
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * Default: `false`
      *
      * Override any environment variables that have already been set on your machine with values from your .env file.
      *
      * example: `require('dotenv').config({ override: true })`
      */
    var `override`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: `path.resolve(process.cwd(), '.env')`
      *
      * Specify a custom path if your file containing environment variables is located elsewhere.
      *
      * example: `require('dotenv').config({ path: '/custom/path/to/.env' })`
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object DotenvConfigOptions {
    
    inline def apply(): DotenvConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DotenvConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait DotenvConfigOutput extends StObject {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var parsed: js.UndefOr[DotenvParseOutput] = js.undefined
  }
  object DotenvConfigOutput {
    
    inline def apply(): DotenvConfigOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvConfigOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DotenvConfigOutput] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setParsed(value: DotenvParseOutput): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      inline def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    }
  }
  
  type DotenvParseOutput = StringDictionary[String]
}
