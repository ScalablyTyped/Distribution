package typings.dotenv

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dotenv", "config")
  @js.native
  def config(): DotenvConfigOutput = js.native
  @JSImport("dotenv", "config")
  @js.native
  def config(options: DotenvConfigOptions): DotenvConfigOutput = js.native
  
  @JSImport("dotenv", "load")
  @js.native
  val load: js.Function1[/* options */ js.UndefOr[DotenvConfigOptions], DotenvConfigOutput] = js.native
  
  @JSImport("dotenv", "parse")
  @js.native
  def parse(src: String): DotenvParseOutput = js.native
  @JSImport("dotenv", "parse")
  @js.native
  def parse(src: String, options: DotenvParseOptions): DotenvParseOutput = js.native
  @JSImport("dotenv", "parse")
  @js.native
  def parse(src: Buffer): DotenvParseOutput = js.native
  @JSImport("dotenv", "parse")
  @js.native
  def parse(src: Buffer, options: DotenvParseOptions): DotenvParseOutput = js.native
  
  @js.native
  trait DotenvConfigOptions extends StObject {
    
    /**
      * You may turn on logging to help debug why certain keys or values are not being set as you expect.
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * You may specify the encoding of your file containing environment variables.
      */
    var encoding: js.UndefOr[String] = js.native
    
    /**
      * You may specify a custom path if your file containing environment variables is located elsewhere.
      */
    var path: js.UndefOr[String] = js.native
  }
  object DotenvConfigOptions {
    
    @scala.inline
    def apply(): DotenvConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvConfigOptions]
    }
    
    @scala.inline
    implicit class DotenvConfigOptionsMutableBuilder[Self <: DotenvConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait DotenvConfigOutput extends StObject {
    
    var error: js.UndefOr[Error] = js.native
    
    var parsed: js.UndefOr[DotenvParseOutput] = js.native
  }
  object DotenvConfigOutput {
    
    @scala.inline
    def apply(): DotenvConfigOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvConfigOutput]
    }
    
    @scala.inline
    implicit class DotenvConfigOutputMutableBuilder[Self <: DotenvConfigOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setParsed(value: DotenvParseOutput): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    }
  }
  
  @js.native
  trait DotenvParseOptions extends StObject {
    
    /**
      * You may turn on logging to help debug why certain keys or values are not being set as you expect.
      */
    var debug: js.UndefOr[Boolean] = js.native
  }
  object DotenvParseOptions {
    
    @scala.inline
    def apply(): DotenvParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvParseOptions]
    }
    
    @scala.inline
    implicit class DotenvParseOptionsMutableBuilder[Self <: DotenvParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  type DotenvParseOutput = StringDictionary[String]
}
