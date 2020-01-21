package typings.googleClosureCompiler.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-closure-compiler", "compiler")
@js.native
class compiler protected () extends Compiler_ {
  def this(opts: js.Array[String]) = this()
  def this(opts: CompileOptions) = this()
  def this(opts: js.Array[String], extraCommandArgs: js.Array[String]) = this()
  def this(opts: CompileOptions, extraCommandArgs: js.Array[String]) = this()
}

@JSImport("google-closure-compiler", "compiler")
@js.native
object compiler
  extends Instantiable1[(/* opts */ js.Array[String]) | (/* opts */ CompileOptions), Compiler_]
     with Instantiable2[
      (/* opts */ js.Array[String]) | (/* opts */ CompileOptions), 
      /* extraCommandArgs */ js.Array[String], 
      Compiler_
    ] {
  var COMPILER_PATH: String = js.native
  var CONTRIB_PATH: String = js.native
  var JAR_PATH: String = js.native
}

