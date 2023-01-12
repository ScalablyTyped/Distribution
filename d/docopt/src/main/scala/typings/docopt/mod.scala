package typings.docopt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("docopt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def docopt(doc: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("docopt")(doc.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def docopt(doc: String, options: DocoptOption): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("docopt")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait DocoptOption extends StObject {
    
    /** is an optional argument vector. It defaults to the arguments passed to your program (process.argv[2..]). You can also supply it with an array of strings, as with process.argv. For example: ['--verbose', '-o', 'hai.txt'] */
    var argv: js.UndefOr[js.Array[String]] = js.undefined
    
    /** (default true) If set to false will cause docopt to throw exceptions instead of printing the error to console and terminating the application. This flag is mainly for testing purposes. */
    var exit: js.UndefOr[Boolean] = js.undefined
    
    /** (default:true) specifies whether the parser should automatically print the help message (supplied as doc) in case -h or --help options are encountered. After showing the usage-message, the program will terminate. If you want to handle -h or --help options manually (the same as other options), set help=false. */
    var help: js.UndefOr[Boolean] = js.undefined
    
    /** (default false) If set to true will disallow mixing options and positional argument. I.e. after first positional argument, all arguments will be interpreted as positional even if the look like options. This can be used for strict compatibility with POSIX, or if you want to dispatch your arguments to other programs. */
    var options_first: js.UndefOr[Boolean] = js.undefined
    
    /** (default:null) is an optional argument that specifies the version of your program. If supplied, then, if the parser encounters --version option, it will print the supplied version and terminate. version could be any printable object, but most likely a string, e.g. '2.1.0rc1'. */
    var version: js.UndefOr[Any] = js.undefined
  }
  object DocoptOption {
    
    inline def apply(): DocoptOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocoptOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocoptOption] (val x: Self) extends AnyVal {
      
      inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value*))
      
      inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setOptions_first(value: Boolean): Self = StObject.set(x, "options_first", value.asInstanceOf[js.Any])
      
      inline def setOptions_firstUndefined: Self = StObject.set(x, "options_first", js.undefined)
      
      inline def setVersion(value: Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
