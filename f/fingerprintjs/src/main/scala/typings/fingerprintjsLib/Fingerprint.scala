package typings
package fingerprintjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Fingerprint")
@js.native
class Fingerprint ()
  extends fingerprintjsLib.FingerprintJsNs.Fingerprint {
  /**
    * Create Fingerprint object.
    */
  def this(hasher: js.Function2[/* key */ java.lang.String, /* seed */ scala.Double, scala.Double]) = this()
  def this(option: fingerprintjsLib.FingerprintJsNs.FingerprintOption) = this()
  /**
    * Generate fingerprint number.
    */
  /* CompleteClass */
  override def get(): scala.Double = js.native
  /**
    * Get canvas data url string.
    */
  /* CompleteClass */
  override def getCanvasFingerprint(): java.lang.String = js.native
  /**
    * Get plugins string from ActiveXObject.
    */
  /* CompleteClass */
  override def getIEPluginsString(): java.lang.String = js.native
  /**
    * Get plugins string.
    */
  /* CompleteClass */
  override def getPluginsString(): java.lang.String = js.native
  /**
    * Get plugins string from navigator plugins.
    */
  /* CompleteClass */
  override def getRegularPluginsString(): java.lang.String = js.native
  /**
    * Get screen height and width.
    */
  /* CompleteClass */
  override def getScreenResolution(): js.Array[scala.Double] = js.native
  /**
    * Check whether or not the browser has local storage.
    */
  /* CompleteClass */
  override def hasLocalStorage(): scala.Boolean = js.native
  /**
    * Check whether or not the browser has session storage.
    */
  /* CompleteClass */
  override def hasSessionStorage(): scala.Boolean = js.native
  /**
    * Check whether or not the browser supports canvas.
    */
  /* CompleteClass */
  override def isCanvasSupported(): scala.Boolean = js.native
  /**
    * Check whether or not the browser is IE.
    */
  /* CompleteClass */
  override def isIE(): scala.Boolean = js.native
  /**
    * Generate fingerprint number using Murmur hashing.
    * @param key ASCII only
    * @param seed Positive integer only
    */
  /* CompleteClass */
  override def murmurhash3_32_gc(key: java.lang.String, seed: scala.Double): scala.Double = js.native
}

