package typings.googleCloudPubsub.anon

import typings.protobufjs.mod.Long
import typings.protobufjs.mod.util.LongBits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLongBits extends StObject {
  
  def from(value: String): LongBits = js.native
  def from(value: Double): LongBits = js.native
  /**
    * Constructs new long bits from a number, long or string.
    * @param value Value
    * @returns Instance
    */
  /* static member */
  def from(value: Long): LongBits = js.native
  
  /**
    * Constructs new long bits from the specified 8 characters long hash.
    * @param hash Hash
    * @returns Bits
    */
  /* static member */
  def fromHash(hash: String): LongBits = js.native
  
  /**
    * Constructs new long bits from the specified number.
    * @param value Value
    * @returns Instance
    */
  /* static member */
  def fromNumber(value: Double): LongBits = js.native
  
  /** Zero bits. */
  /* static member */
  var zero: LongBits = js.native
  
  /** Zero hash. */
  /* static member */
  var zeroHash: String = js.native
}
