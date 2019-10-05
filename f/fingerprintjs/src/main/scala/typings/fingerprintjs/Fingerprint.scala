package typings.fingerprintjs

import org.scalablytyped.runtime.TopLevel
import typings.fingerprintjs.FingerprintJs.FingerprintOption
import typings.fingerprintjs.FingerprintJs.FingerprintStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Fingerprint")
@js.native
class Fingerprint ()
  extends typings.fingerprintjs.FingerprintJs.Fingerprint {
  /**
    * Create Fingerprint object.
    */
  def this(hasher: js.Function2[/* key */ String, /* seed */ Double, Double]) = this()
  def this(option: FingerprintOption) = this()
  /**
    * Generate fingerprint number.
    */
  /* CompleteClass */
  override def get(): Double = js.native
  /**
    * Get canvas data url string.
    */
  /* CompleteClass */
  override def getCanvasFingerprint(): String = js.native
  /**
    * Get plugins string from ActiveXObject.
    */
  /* CompleteClass */
  override def getIEPluginsString(): String = js.native
  /**
    * Get plugins string.
    */
  /* CompleteClass */
  override def getPluginsString(): String = js.native
  /**
    * Get plugins string from navigator plugins.
    */
  /* CompleteClass */
  override def getRegularPluginsString(): String = js.native
  /**
    * Get screen height and width.
    */
  /* CompleteClass */
  override def getScreenResolution(): js.Array[Double] = js.native
  /**
    * Check whether or not the browser has local storage.
    */
  /* CompleteClass */
  override def hasLocalStorage(): Boolean = js.native
  /**
    * Check whether or not the browser has session storage.
    */
  /* CompleteClass */
  override def hasSessionStorage(): Boolean = js.native
  /**
    * Check whether or not the browser supports canvas.
    */
  /* CompleteClass */
  override def isCanvasSupported(): Boolean = js.native
  /**
    * Check whether or not the browser is IE.
    */
  /* CompleteClass */
  override def isIE(): Boolean = js.native
  /**
    * Generate fingerprint number using Murmur hashing.
    * @param key ASCII only
    * @param seed Positive integer only
    */
  /* CompleteClass */
  override def murmurhash3_32_gc(key: String, seed: Double): Double = js.native
}

@JSGlobal("Fingerprint")
@js.native
object Fingerprint extends TopLevel[FingerprintStatic]

