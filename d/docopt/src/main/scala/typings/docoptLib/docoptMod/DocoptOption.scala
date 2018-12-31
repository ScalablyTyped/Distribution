package typings
package docoptLib.docoptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocoptOption extends js.Object {
  /** is an optional argument vector. It defaults to the arguments passed to your program (process.argv[2..]). You can also supply it with an array of strings, as with process.argv. For example: ['--verbose', '-o', 'hai.txt'] */
  var argv: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** (default true) If set to false will cause docopt to throw exceptions instead of printing the error to console and terminating the application. This flag is mainly for testing purposes. */
  var exit: js.UndefOr[scala.Boolean] = js.undefined
  /** (default:true) specifies whether the parser should automatically print the help message (supplied as doc) in case -h or --help options are encountered. After showing the usage-message, the program will terminate. If you want to handle -h or --help options manually (the same as other options), set help=false. */
  var help: js.UndefOr[scala.Boolean] = js.undefined
  /** (default false) If set to true will disallow mixing options and positional argument. I.e. after first positional argument, all arguments will be interpreted as positional even if the look like options. This can be used for strict compatibility with POSIX, or if you want to dispatch your arguments to other programs. */
  var options_first: js.UndefOr[scala.Boolean] = js.undefined
  /** (default:null) is an optional argument that specifies the version of your program. If supplied, then, if the parser encounters --version option, it will print the supplied version and terminate. version could be any printable object, but most likely a string, e.g. '2.1.0rc1'. */
  var version: js.UndefOr[js.Any] = js.undefined
}

