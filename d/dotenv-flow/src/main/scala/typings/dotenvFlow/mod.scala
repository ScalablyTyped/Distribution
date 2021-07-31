package typings.dotenvFlow

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dotenv-flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def config(): DotenvLoadOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[DotenvLoadOutput]
  @scala.inline
  def config(options: DotenvConfigOptions): DotenvLoadOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[DotenvLoadOutput]
  
  @scala.inline
  def listDotenvFiles(dirname: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listDotenvFiles")(dirname.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def listDotenvFiles(dirname: String, options: DotenvListFilesOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("listDotenvFiles")(dirname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def load(filenames: String): DotenvLoadOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filenames.asInstanceOf[js.Any]).asInstanceOf[DotenvLoadOutput]
  @scala.inline
  def load(filenames: String, options: DotenvReadFileOptions): DotenvLoadOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filenames.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DotenvLoadOutput]
  @scala.inline
  def load(filenames: js.Array[String]): DotenvLoadOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filenames.asInstanceOf[js.Any]).asInstanceOf[DotenvLoadOutput]
  @scala.inline
  def load(filenames: js.Array[String], options: DotenvReadFileOptions): DotenvLoadOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filenames.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DotenvLoadOutput]
  
  @scala.inline
  def parse(filenames: String): DotenvParseOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filenames.asInstanceOf[js.Any]).asInstanceOf[DotenvParseOutput]
  @scala.inline
  def parse(filenames: String, options: DotenvReadFileOptions): DotenvParseOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filenames.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DotenvParseOutput]
  @scala.inline
  def parse(filenames: js.Array[String]): DotenvParseOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filenames.asInstanceOf[js.Any]).asInstanceOf[DotenvParseOutput]
  @scala.inline
  def parse(filenames: js.Array[String], options: DotenvReadFileOptions): DotenvParseOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filenames.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DotenvParseOutput]
  
  @scala.inline
  def unload(filenames: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unload")(filenames.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unload(filenames: String, options: DotenvReadFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unload")(filenames.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unload(filenames: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unload")(filenames.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unload(filenames: js.Array[String], options: DotenvReadFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unload")(filenames.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait DotenvConfigOptions extends StObject {
    
    /**
      * Default node environment to use if `process.env.NODE_ENV` is not present.
      */
    var default_node_env: js.UndefOr[String] = js.undefined
    
    /**
      * Encoding for reading the `.env*` files.
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * Node environment (development/test/production/etc,.).
      */
    var node_env: js.UndefOr[String] = js.undefined
    
    /**
      * Path to `.env*` files directory.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * In some cases the original "dotenv" library can be used by one of the dependent npm modules.
      * It causes calling the original `dotenv.config()` that loads the `.env` file from your project before you can call `dotenv-flow.config()`.
      *
      * Such cases breaks `.env*` files priority because the previously loaded environment variables are treated as shell-defined thus having the higher priority.
      *
      * Setting the `purge_dotenv` option to `true` can gracefully fix this issue.
      */
    var purge_dotenv: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Suppress all console outputs except errors and deprecation warnings.
      */
    var silent: js.UndefOr[Boolean] = js.undefined
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
  
  trait DotenvListFilesOptions extends StObject {
    
    /**
      * Node environment (development/test/production/etc,.).
      */
    var node_env: js.UndefOr[String] = js.undefined
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
  
  trait DotenvLoadOutput extends StObject {
    
    var error: js.UndefOr[Error] = js.undefined
    
    var parsed: js.UndefOr[DotenvParseOutput] = js.undefined
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
  
  trait DotenvReadFileOptions extends StObject {
    
    /**
      * Encoding for reading the `.env*` files.
      */
    var encoding: js.UndefOr[String] = js.undefined
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
