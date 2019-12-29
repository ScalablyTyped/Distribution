package typings.googleDashClosureDashCompiler.googleDashClosureDashCompilerMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compiler extends js.Object {
  var javaPath: String = js.native
  var spawnOptions: StringDictionary[String] = js.native
  def getFullCommand(): String = js.native
  def logger(args: js.Any*): Unit = js.native
  def run(): ChildProcess = js.native
  def run(callback: js.Function3[/* exitCode */ Double, /* stdout */ String, /* stderr */ String, Unit]): ChildProcess = js.native
}

@JSImport("google-closure-compiler", "compiler")
@js.native
class compiler protected () extends Compiler {
  def this(opts: js.Array[String]) = this()
  def this(opts: CompileOptions) = this()
  def this(opts: js.Array[String], extraCommandArgs: js.Array[String]) = this()
  def this(opts: CompileOptions, extraCommandArgs: js.Array[String]) = this()
}

@JSImport("google-closure-compiler", "compiler")
@js.native
object compiler
  extends Instantiable1[(/* opts */ js.Array[String]) | (/* opts */ CompileOptions), Compiler]
     with Instantiable2[
      (/* opts */ js.Array[String]) | (/* opts */ CompileOptions), 
      /* extraCommandArgs */ js.Array[String], 
      Compiler
    ] {
  var COMPILER_PATH: String = js.native
  var CONTRIB_PATH: String = js.native
  var JAR_PATH: String = js.native
}

