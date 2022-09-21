package typings.fridaGum.global

import typings.fridaGum.ArrayBuffer
import typings.fridaGum.ChecksumType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to checksumming algorithms.
  */
@JSGlobal("Checksum")
@js.native
open class Checksum protected ()
  extends StObject
     with typings.fridaGum.Checksum {
  /**
    * Creates an instance used to compute a checksum for a stream of data.
    * Starts out in "open" state where data is fed in through one or more calls
    * to `update()`. Once done, `getString()` or `getDigest()` is called to
    * obtain the computed checksum. This also moves the instance to "closed"
    * state, which means `update()` may no longer be called. (Create a new
    * instance to compute a checksum for subsequent data.)
    *
    * @param type The type of checksum to compute.
    */
  def this(`type`: ChecksumType) = this()
}
object Checksum {
  
  @JSGlobal("Checksum")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Computes the checksum of the specified `data`. Returns the checksum as an
    * all-lowercase hexadecimal string. The length of the digest depends on the
    * type of checksum.
    *
    * @param type The desired type of checksum.
    * @param data The data to compute the checksum of.
    */
  /* static member */
  inline def compute(`type`: ChecksumType, data: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compute")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def compute(`type`: ChecksumType, data: js.Array[Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compute")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def compute(`type`: ChecksumType, data: ArrayBuffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compute")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
}
