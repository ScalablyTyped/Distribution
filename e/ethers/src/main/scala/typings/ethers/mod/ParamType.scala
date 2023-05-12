package typings.ethers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ParamType")
@js.native
open class ParamType protected ()
  extends typings.ethers.typesEthersMod.ParamType {
  /**
    *  @private
    */
  def this(guard: Any, name: String, `type`: String, baseType: String) = this()
  def this(guard: Any, name: String, `type`: String, baseType: String, indexed: Boolean) = this()
  def this(
    guard: Any,
    name: String,
    `type`: String,
    baseType: String,
    indexed: Boolean,
    components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType]
  ) = this()
  def this(
    guard: Any,
    name: String,
    `type`: String,
    baseType: String,
    indexed: Null,
    components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType]
  ) = this()
  def this(
    guard: Any,
    name: String,
    `type`: String,
    baseType: String,
    indexed: Boolean,
    components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
    arrayLength: Double
  ) = this()
  def this(
    guard: Any,
    name: String,
    `type`: String,
    baseType: String,
    indexed: Boolean,
    components: Null,
    arrayLength: Double
  ) = this()
  def this(
    guard: Any,
    name: String,
    `type`: String,
    baseType: String,
    indexed: Null,
    components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
    arrayLength: Double
  ) = this()
  def this(
    guard: Any,
    name: String,
    `type`: String,
    baseType: String,
    indexed: Null,
    components: Null,
    arrayLength: Double
  ) = this()
  def this(
    guard: Any,
    name: String,
    `type`: String,
    baseType: String,
    indexed: Boolean,
    components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
    arrayLength: Double,
    arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
  ) = this()
  def this(
    guard: Any,
    name: String,
    `type`: String,
    baseType: String,
    indexed: Boolean,
    components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
    arrayLength: Null,
    arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
  ) = this()
  def this(
    guard: Any,
    name: String,
    `type`: String,
    baseType: String,
    indexed: Boolean,
    components: Null,
    arrayLength: Double,
    arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
  ) = this()
  def this(
    guard: Any,
    name: String,
    `type`: String,
    baseType: String,
    indexed: Boolean,
    components: Null,
    arrayLength: Null,
    arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
  ) = this()
  def this(
    guard: Any,
    name: String,
    `type`: String,
    baseType: String,
    indexed: Null,
    components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
    arrayLength: Double,
    arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
  ) = this()
  def this(
    guard: Any,
    name: String,
    `type`: String,
    baseType: String,
    indexed: Null,
    components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
    arrayLength: Null,
    arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
  ) = this()
  def this(
    guard: Any,
    name: String,
    `type`: String,
    baseType: String,
    indexed: Null,
    components: Null,
    arrayLength: Double,
    arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
  ) = this()
  def this(
    guard: Any,
    name: String,
    `type`: String,
    baseType: String,
    indexed: Null,
    components: Null,
    arrayLength: Null,
    arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
  ) = this()
}
/* static members */
object ParamType {
  
  @JSImport("ethers", "ParamType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Creates a new **ParamType** for %%obj%%.
    *
    *  If %%allowIndexed%% then the ``indexed`` keyword is permitted,
    *  otherwise the ``indexed`` keyword will throw an error.
    */
  inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.ParamType]
  inline def from(obj: Any, allowIndexed: Boolean): typings.ethers.typesAbiFragmentsMod.ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesAbiFragmentsMod.ParamType]
  
  /**
    *  Returns true if %%value%% is a **ParamType**.
    */
  inline def isParamType(value: Any): /* is ethers.ethers/types/abi/fragments.ParamType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParamType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.ParamType */ Boolean]
}
