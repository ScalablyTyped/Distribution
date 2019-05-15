package typings
package difflibLib.difflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("difflib", "SequenceMatcher")
@js.native
class SequenceMatcher[T] protected () extends js.Object {
  def this(isjunk: js.Function0[scala.Boolean], left: T, right: T) = this()
  def this(isjunk: scala.Null, left: T, right: T) = this()
  def this(isjunk: js.Function0[scala.Boolean], left: T, right: T, autojunk: scala.Boolean) = this()
  def this(isjunk: scala.Null, left: T, right: T, autojunk: scala.Boolean) = this()
  def getOpcodes(): js.Array[
    js.Tuple5[
      difflibLib.difflibLibStrings.replace | difflibLib.difflibLibStrings.delete | difflibLib.difflibLibStrings.insert | difflibLib.difflibLibStrings.equal, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double
    ]
  ] = js.native
}

