package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to checksumming algorithms.
  */
@js.native
trait Checksum extends StObject {
  
  /**
    * Gets the digest as a raw binary vector. The size of the digest depends
    * on the type of checksum.
    *
    * Once this method has been called the checksum can no longer be updated
    * with `update()`.
    */
  def getDigest(): ArrayBuffer = js.native
  
  /**
    * Gets the digest as an all-lowercase hexadecimal string. The length of the
    * digest depends on the type of checksum.
    *
    * Once this method has been called the checksum can no longer be updated
    * with `update()`.
    */
  def getString(): String = js.native
  
  /**
    * Feeds `data` into the checksum instance. The checksum must still be open,
    * i.e. `getString()` or `getDigest()` must not have been called yet.
    *
    * @param data The data used to compute the checksum.
    */
  def update(data: String): Checksum = js.native
  def update(data: js.Array[Double]): Checksum = js.native
  def update(data: ArrayBuffer): Checksum = js.native
}
