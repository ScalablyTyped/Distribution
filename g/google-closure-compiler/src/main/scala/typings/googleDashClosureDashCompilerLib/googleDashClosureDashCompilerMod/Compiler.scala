package typings
package googleDashClosureDashCompilerLib.googleDashClosureDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compiler extends js.Object {
  var javaPath: java.lang.String = js.native
  var spawnOptions: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def getFullCommand(): java.lang.String = js.native
  def logger(args: js.Any*): scala.Unit = js.native
  def run(): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def run(
    callback: js.Function3[
      /* exitCode */ scala.Double, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
}

@JSImport("google-closure-compiler", "compiler")
@js.native
class compiler protected () extends Compiler {
  def this(opts: googleDashClosureDashCompilerLib.CompileOptions) = this()
  def this(opts: js.Array[java.lang.String]) = this()
  def this(opts: googleDashClosureDashCompilerLib.CompileOptions, extraCommandArgs: js.Array[java.lang.String]) = this()
  def this(opts: js.Array[java.lang.String], extraCommandArgs: js.Array[java.lang.String]) = this()
}

@JSImport("google-closure-compiler", "compiler")
@js.native
object compiler
  extends org.scalablytyped.runtime.Instantiable2[
      (/* opts */ js.Array[java.lang.String]) | (/* opts */ googleDashClosureDashCompilerLib.CompileOptions), 
      /* extraCommandArgs */ js.Array[java.lang.String], 
      Compiler
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* opts */ js.Array[java.lang.String]) | (/* opts */ googleDashClosureDashCompilerLib.CompileOptions), 
      Compiler
    ] {
  var COMPILER_PATH: java.lang.String = js.native
  var CONTRIB_PATH: java.lang.String = js.native
  var JAR_PATH: java.lang.String = js.native
}

