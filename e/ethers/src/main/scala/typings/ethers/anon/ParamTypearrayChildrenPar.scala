package typings.ethers.anon

import typings.ethers.typesAbiFragmentsMod.FormatType
import typings.ethers.typesAbiFragmentsMod.ParamType
import typings.ethers.typesAbiFragmentsMod.ParamTypeWalkAsyncFunc
import typings.ethers.typesAbiFragmentsMod.ParamTypeWalkFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined ethers.ethers/types/abi/fragments.ParamType & {  arrayChildren :ethers.ethers/types/abi/fragments.ParamType,   arrayLength :number} */
@js.native
trait ParamTypearrayChildrenPar extends StObject {
  
  /**
    *  The type of each child in the array.
    *
    *  For non-array types this is ``null``.
    */
  val arrayChildren: Null | ParamType = js.native
  
  /**
    *  The array length, or ``-1`` for dynamic-lengthed arrays.
    *
    *  For non-array types this is ``null``.
    */
  val arrayLength: Null | Double = js.native
  
  /**
    *  The base type (e.g. ``"address"``, ``"tuple"``, ``"array"``)
    */
  val baseType: String = js.native
  
  /**
    *  The components for the tuple.
    *
    *  For non-tuple types this is ``null``.
    */
  val components: Null | js.Array[ParamType] = js.native
  
  /**
    *  Return a string representation of this type.
    *
    *  For example,
    *
    *  ``sighash" => "(uint256,address)"``
    *
    *  ``"minimal" => "tuple(uint256,address) indexed"``
    *
    *  ``"full" => "tuple(uint256 foo, address bar) indexed baz"``
    */
  def format(): String = js.native
  def format(format: FormatType): String = js.native
  
  /**
    *  True if the parameters is indexed.
    *
    *  For non-indexable types this is ``null``.
    */
  val indexed: Null | Boolean = js.native
  
  /**
    *  Returns true if %%this%% is an Array type.
    *
    *  This provides a type gaurd ensuring that [[arrayChildren]]
    *  and [[arrayLength]] are non-null.
    */
  def isArray(): Boolean = js.native
  
  /**
    *  Returns true if %%this%% is an Indexable type.
    *
    *  This provides a type gaurd ensuring that [[indexed]]
    *  is non-null.
    */
  def isIndexable(): /* is ethers.anon.ParamTypeindexedbooleanArrayChildren */ Boolean = js.native
  
  /**
    *  Returns true if %%this%% is a Tuple type.
    *
    *  This provides a type gaurd ensuring that [[components]]
    *  is non-null.
    */
  def isTuple(): /* is ethers.anon.ParamTypecomponentsReadon */ Boolean = js.native
  
  /**
    *  The local name of the parameter (or ``""`` if unbound)
    */
  val name: String = js.native
  
  /* private */ var `private`: Any = js.native
  
  /**
    *  The fully qualified type (e.g. ``"address"``, ``"tuple(address)"``,
    *  ``"uint256[3][]"``)
    */
  val `type`: String = js.native
  
  /**
    *  Walks the **ParamType** with %%value%%, calling %%process%%
    *  on each type, destructing the %%value%% recursively.
    */
  def walk(value: Any, process: ParamTypeWalkFunc): Any = js.native
  
  /**
    *  Walks the **ParamType** with %%value%%, asynchronously calling
    *  %%process%% on each type, destructing the %%value%% recursively.
    *
    *  This can be used to resolve ENS naes by walking and resolving each
    *  ``"address"`` type.
    */
  def walkAsync(value: Any, process: ParamTypeWalkAsyncFunc): js.Promise[Any] = js.native
}
