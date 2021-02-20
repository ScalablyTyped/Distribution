package typings.dotenvFlow

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dotenv-flow", "config")
  @js.native
  def config(): DotenvLoadOutput = js.native
  @JSImport("dotenv-flow", "config")
  @js.native
  def config(options: DotenvConfigOptions): DotenvLoadOutput = js.native
  
  @JSImport("dotenv-flow", "listDotenvFiles")
  @js.native
  def listDotenvFiles(dirname: String): js.Array[String] = js.native
  @JSImport("dotenv-flow", "listDotenvFiles")
  @js.native
  def listDotenvFiles(dirname: String, options: DotenvListFilesOptions): js.Array[String] = js.native
  
  @JSImport("dotenv-flow", "load")
  @js.native
  def load(filenames: String): DotenvLoadOutput = js.native
  @JSImport("dotenv-flow", "load")
  @js.native
  def load(filenames: String, options: DotenvReadFileOptions): DotenvLoadOutput = js.native
  @JSImport("dotenv-flow", "load")
  @js.native
  def load(filenames: js.Array[String]): DotenvLoadOutput = js.native
  @JSImport("dotenv-flow", "load")
  @js.native
  def load(filenames: js.Array[String], options: DotenvReadFileOptions): DotenvLoadOutput = js.native
  
  @JSImport("dotenv-flow", "parse")
  @js.native
  def parse(filenames: String): DotenvParseOutput = js.native
  @JSImport("dotenv-flow", "parse")
  @js.native
  def parse(filenames: String, options: DotenvReadFileOptions): DotenvParseOutput = js.native
  @JSImport("dotenv-flow", "parse")
  @js.native
  def parse(filenames: js.Array[String]): DotenvParseOutput = js.native
  @JSImport("dotenv-flow", "parse")
  @js.native
  def parse(filenames: js.Array[String], options: DotenvReadFileOptions): DotenvParseOutput = js.native
  
  @JSImport("dotenv-flow", "unload")
  @js.native
  def unload(filenames: String): Unit = js.native
  @JSImport("dotenv-flow", "unload")
  @js.native
  def unload(filenames: String, options: DotenvReadFileOptions): Unit = js.native
  @JSImport("dotenv-flow", "unload")
  @js.native
  def unload(filenames: js.Array[String]): Unit = js.native
  @JSImport("dotenv-flow", "unload")
  @js.native
  def unload(filenames: js.Array[String], options: DotenvReadFileOptions): Unit = js.native
  
  @js.native
  trait DotenvConfigOptions extends StObject {
    
    /**
      * Default node environment to use if `process.env.NODE_ENV` is not present.
      */
    var default_node_env: js.UndefOr[String] = js.native
    
    /**
      * Encoding for reading the `.env*` files.
      */
    var encoding: js.UndefOr[String] = js.native
    
    /**
      * Node environment (development/test/production/etc,.).
      */
    var node_env: js.UndefOr[String] = js.native
    
    /**
      * Path to `.env*` files directory.
      */
    var path: js.UndefOr[String] = js.native
    
    /**
      * In some cases the original "dotenv" library can be used by one of the dependent npm modules.
      * It causes calling the original `dotenv.config()` that loads the `.env` file from your project before you can call `dotenv-flow.config()`.
      *
      * Such cases breaks `.env*` files priority because the previously loaded environment variables are treated as shell-defined thus having the higher priority.
      *
      * Setting the `purge_dotenv` option to `true` can gracefully fix this issue.
      */
    var purge_dotenv: js.UndefOr[Boolean] = js.native
    
    /**
      * Suppress all console outputs except errors and deprecation warnings.
      */
    var silent: js.UndefOr[Boolean] = js.native
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
      def setDefault_node_env(value: String): Self = StObject.set(x, "default_node_env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_node_envUndefined: Self = StObject.set(x, "default_node_env", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setNode_env(value: String): Self = StObject.set(x, "node_env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode_envUndefined: Self = StObject.set(x, "node_env", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPurge_dotenv(value: Boolean): Self = StObject.set(x, "purge_dotenv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurge_dotenvUndefined: Self = StObject.set(x, "purge_dotenv", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  @js.native
  trait DotenvListFilesOptions extends StObject {
    
    /**
      * Node environment (development/test/production/etc,.).
      */
    var node_env: js.UndefOr[String] = js.native
  }
  object DotenvListFilesOptions {
    
    @scala.inline
    def apply(): DotenvListFilesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvListFilesOptions]
    }
    
    @scala.inline
    implicit class DotenvListFilesOptionsMutableBuilder[Self <: DotenvListFilesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode_env(value: String): Self = StObject.set(x, "node_env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode_envUndefined: Self = StObject.set(x, "node_env", js.undefined)
    }
  }
  
  @js.native
  trait DotenvLoadOutput extends StObject {
    
    var error: js.UndefOr[Error] = js.native
    
    var parsed: js.UndefOr[DotenvParseOutput] = js.native
  }
  object DotenvLoadOutput {
    
    @scala.inline
    def apply(): DotenvLoadOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvLoadOutput]
    }
    
    @scala.inline
    implicit class DotenvLoadOutputMutableBuilder[Self <: DotenvLoadOutput] (val x: Self) extends AnyVal {
      
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
  
  type DotenvParseOutput = StringDictionary[String]
  
  @js.native
  trait DotenvReadFileOptions extends StObject {
    
    /**
      * Encoding for reading the `.env*` files.
      */
    var encoding: js.UndefOr[String] = js.native
  }
  object DotenvReadFileOptions {
    
    @scala.inline
    def apply(): DotenvReadFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvReadFileOptions]
    }
    
    @scala.inline
    implicit class DotenvReadFileOptionsMutableBuilder[Self <: DotenvReadFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}
