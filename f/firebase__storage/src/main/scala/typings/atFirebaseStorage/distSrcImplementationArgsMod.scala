package typings.atFirebaseStorage

import typings.atFirebaseStorage.distSrcImplementationArgsMod.ArgSpec
import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/args", JSImport.Namespace)
@js.native
object distSrcImplementationArgsMod extends js.Object {
  @js.native
  class ArgSpec protected () extends js.Object {
    def this(validator: js.Function1[/* p1 */ js.Any, Unit]) = this()
    def this(validator: js.Function1[/* p1 */ js.Any, Unit], optional: Boolean) = this()
    var optional: Boolean = js.native
    def validator(p1: js.Any): Unit = js.native
  }
  
  def and_(v1: js.Function1[/* p1 */ js.Any, Unit], v2: js.Function1[/* p1 */ js.Any, Unit]): js.Function1[/* p1 */ js.Any, Unit] = js.native
  def listOptionSpec(): ArgSpec = js.native
  def listOptionSpec(optional: Boolean): ArgSpec = js.native
  def looseObjectSpec(): ArgSpec = js.native
  def looseObjectSpec(validator: js.Function1[/* p1 */ js.Any, Unit]): ArgSpec = js.native
  def looseObjectSpec(validator: js.Function1[/* p1 */ js.Any, Unit], optional: Boolean): ArgSpec = js.native
  def looseObjectSpec(validator: Null, optional: Boolean): ArgSpec = js.native
  def metadataSpec(): ArgSpec = js.native
  def metadataSpec(optional: Boolean): ArgSpec = js.native
  def nonNegativeNumberSpec(): ArgSpec = js.native
  def nullFunctionSpec(): ArgSpec = js.native
  def nullFunctionSpec(optional: Boolean): ArgSpec = js.native
  def stringSpec(): ArgSpec = js.native
  def stringSpec(validator: js.Function1[/* p1 */ js.Any, Unit | Null]): ArgSpec = js.native
  def stringSpec(validator: js.Function1[/* p1 */ js.Any, Unit | Null], optional: Boolean): ArgSpec = js.native
  def uploadDataSpec(): ArgSpec = js.native
  def validate(name: String, specs: js.Array[ArgSpec], passed: IArguments): Unit = js.native
}

