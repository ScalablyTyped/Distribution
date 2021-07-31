package typings.globby

import typings.fastGlob.mod.Options
import typings.globby.anon.Extensions
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Find files and directories using glob patterns.
  	Note that glob patterns can only contain forward-slashes, not backward-slashes, so if you want to construct a glob pattern from path components, you need to use `path.posix.join()` instead of `path.join()`.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-3) in addition to the ones in this package.
  	@returns The matching paths.
  	@example
  	```
  	import globby = require('globby');
  	(async () => {
  		const paths = await globby(['*', '!cake']);
  		console.log(paths);
  		//=> ['unicorn', 'rainbow']
  	})();
  	```
  	*/
  @scala.inline
  def apply(patterns: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply(patterns: String, options: GlobbyOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply(patterns: js.Array[String]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply(patterns: js.Array[String], options: GlobbyOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  @JSImport("globby", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Note that you should avoid running the same tasks multiple times as they contain a file system cache. Instead, run this method each time to ensure file system changes are taken into consideration.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-3) in addition to the ones in this package.
  	@returns An object in the format `{pattern: string, options: object}`, which can be passed as arguments to [`fast-glob`](https://github.com/mrmlnc/fast-glob). This is useful for other globbing-related packages.
  	*/
  @scala.inline
  def generateGlobTasks(patterns: String): js.Array[GlobTask] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateGlobTasks")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[GlobTask]]
  @scala.inline
  def generateGlobTasks(patterns: String, options: GlobbyOptions): js.Array[GlobTask] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateGlobTasks")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[GlobTask]]
  @scala.inline
  def generateGlobTasks(patterns: js.Array[String]): js.Array[GlobTask] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateGlobTasks")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[GlobTask]]
  @scala.inline
  def generateGlobTasks(patterns: js.Array[String], options: GlobbyOptions): js.Array[GlobTask] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateGlobTasks")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[GlobTask]]
  
  /**
  	`.gitignore` files matched by the ignore config are not used for the resulting filter function.
  	@returns A filter function indicating whether a given path is ignored via a `.gitignore` file.
  	@example
  	```
  	import {gitignore} from 'globby';
  	(async () => {
  		const isIgnored = await gitignore();
  		console.log(isIgnored('some/file'));
  	})();
  	```
  	*/
  @scala.inline
  def gitignore(): js.Promise[FilterFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("gitignore")().asInstanceOf[js.Promise[FilterFunction]]
  @scala.inline
  def gitignore(options: GitignoreOptions): js.Promise[FilterFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("gitignore")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FilterFunction]]
  @JSImport("globby", "gitignore")
  @js.native
  val gitignore_Fmod: Gitignore = js.native
  
  /**
  	Note that the options affect the results.
  	This function is backed by [`fast-glob`](https://github.com/mrmlnc/fast-glob#isdynamicpatternpattern-options).
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-3).
  	@returns Whether there are any special glob characters in the `patterns`.
  	*/
  @scala.inline
  def hasMagic(patterns: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(patterns.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def hasMagic(patterns: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasMagic(patterns: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(patterns.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def hasMagic(patterns: js.Array[String], options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
  	Find files and directories using glob patterns.
  	Note that glob patterns can only contain forward-slashes, not backward-slashes, so if you want to construct a glob pattern from path components, you need to use `path.posix.join()` instead of `path.join()`.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-3) in addition to the ones in this package.
  	@returns The stream of matching paths.
  	@example
  	```
  	import globby = require('globby');
  	(async () => {
  		for await (const path of globby.stream('*.tmp')) {
  			console.log(path);
  		}
  	})();
  	```
  	*/
  @scala.inline
  def stream(patterns: String): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(patterns.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  @scala.inline
  def stream(patterns: String, options: GlobbyOptions): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  @scala.inline
  def stream(patterns: js.Array[String]): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(patterns.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  @scala.inline
  def stream(patterns: js.Array[String], options: GlobbyOptions): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  /**
  	Find files and directories using glob patterns.
  	Note that glob patterns can only contain forward-slashes, not backward-slashes, so if you want to construct a glob pattern from path components, you need to use `path.posix.join()` instead of `path.join()`.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-3) in addition to the ones in this package.
  	@returns The matching paths.
  	*/
  @scala.inline
  def sync(patterns: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def sync(patterns: String, options: GlobbyOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def sync(patterns: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def sync(patterns: js.Array[String], options: GlobbyOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  type ExpandDirectoriesOption = Boolean | js.Array[String] | Extensions
  
  type FilterFunction = js.Function1[/* path */ String, Boolean]
  
  @js.native
  trait Gitignore extends StObject {
    
    /**
    	`.gitignore` files matched by the ignore config are not used for the resulting filter function.
    	@returns A filter function indicating whether a given path is ignored via a `.gitignore` file.
    	@example
    	```
    	import {gitignore} from 'globby';
    	(async () => {
    		const isIgnored = await gitignore();
    		console.log(isIgnored('some/file'));
    	})();
    	```
    	*/
    def apply(): js.Promise[FilterFunction] = js.native
    def apply(options: GitignoreOptions): js.Promise[FilterFunction] = js.native
    
    /**
    	@returns A filter function indicating whether a given path is ignored via a `.gitignore` file.
    	*/
    def sync(): FilterFunction = js.native
    def sync(options: GitignoreOptions): FilterFunction = js.native
  }
  
  trait GitignoreOptions extends StObject {
    
    val cwd: js.UndefOr[String] = js.undefined
    
    val ignore: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GitignoreOptions {
    
    @scala.inline
    def apply(): GitignoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitignoreOptions]
    }
    
    @scala.inline
    implicit class GitignoreOptionsMutableBuilder[Self <: GitignoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    }
  }
  
  trait GlobTask extends StObject {
    
    val options: GlobbyOptions
    
    val pattern: String
  }
  object GlobTask {
    
    @scala.inline
    def apply(options: GlobbyOptions, pattern: String): GlobTask = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobTask]
    }
    
    @scala.inline
    implicit class GlobTaskMutableBuilder[Self <: GlobTask] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: GlobbyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobbyOptions
    extends StObject
       with typings.fastGlob.settingsMod.Options {
    
    /**
    		If set to `true`, `globby` will automatically glob directories for you. If you define an `Array` it will only glob files that matches the patterns inside the `Array`. You can also define an `Object` with `files` and `extensions` like in the example below.
    		Note that if you set this option to `false`, you won't get back matched directories unless you set `onlyFiles: false`.
    		@default true
    		@example
    		```
    		import globby = require('globby');
    		(async () => {
    			const paths = await globby('images', {
    				expandDirectories: {
    					files: ['cat', 'unicorn', '*.jpg'],
    					extensions: ['png']
    				}
    			});
    			console.log(paths);
    			//=> ['cat.png', 'unicorn.png', 'cow.jpg', 'rainbow.jpg']
    		})();
    		```
    		*/
    val expandDirectories: js.UndefOr[ExpandDirectoriesOption] = js.undefined
    
    /**
    		Respect ignore patterns in `.gitignore` files that apply to the globbed files.
    		@default false
    		*/
    val gitignore: js.UndefOr[Boolean] = js.undefined
  }
  object GlobbyOptions {
    
    @scala.inline
    def apply(): GlobbyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobbyOptions]
    }
    
    @scala.inline
    implicit class GlobbyOptionsMutableBuilder[Self <: GlobbyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandDirectories(value: ExpandDirectoriesOption): Self = StObject.set(x, "expandDirectories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandDirectoriesUndefined: Self = StObject.set(x, "expandDirectories", js.undefined)
      
      @scala.inline
      def setExpandDirectoriesVarargs(value: String*): Self = StObject.set(x, "expandDirectories", js.Array(value :_*))
      
      @scala.inline
      def setGitignore(value: Boolean): Self = StObject.set(x, "gitignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitignoreUndefined: Self = StObject.set(x, "gitignore", js.undefined)
    }
  }
}
