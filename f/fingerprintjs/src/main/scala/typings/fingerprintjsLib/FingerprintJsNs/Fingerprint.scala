package typings
package fingerprintjsLib.FingerprintJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fingerprint extends js.Object {
  /**
    * Generate fingerprint number.
    */
  def get(): scala.Double
  /**
    * Get canvas data url string.
    */
  def getCanvasFingerprint(): java.lang.String
  /**
    * Get plugins string from ActiveXObject.
    */
  def getIEPluginsString(): java.lang.String
  /**
    * Get plugins string.
    */
  def getPluginsString(): java.lang.String
  /**
    * Get plugins string from navigator plugins.
    */
  def getRegularPluginsString(): java.lang.String
  /**
    * Get screen height and width.
    */
  def getScreenResolution(): js.Array[scala.Double]
  /**
    * Check whether or not the browser has local storage.
    */
  def hasLocalStorage(): scala.Boolean
  /**
    * Check whether or not the browser has session storage.
    */
  def hasSessionStorage(): scala.Boolean
  /**
    * Check whether or not the browser supports canvas.
    */
  def isCanvasSupported(): scala.Boolean
  /**
    * Check whether or not the browser is IE.
    */
  def isIE(): scala.Boolean
  /**
    * Generate fingerprint number using Murmur hashing.
    * @param key ASCII only
    * @param seed Positive integer only
    */
  def murmurhash3_32_gc(key: java.lang.String, seed: scala.Double): scala.Double
}

object Fingerprint {
  @scala.inline
  def apply(
    get: js.Function0[scala.Double],
    getCanvasFingerprint: js.Function0[java.lang.String],
    getIEPluginsString: js.Function0[java.lang.String],
    getPluginsString: js.Function0[java.lang.String],
    getRegularPluginsString: js.Function0[java.lang.String],
    getScreenResolution: js.Function0[js.Array[scala.Double]],
    hasLocalStorage: js.Function0[scala.Boolean],
    hasSessionStorage: js.Function0[scala.Boolean],
    isCanvasSupported: js.Function0[scala.Boolean],
    isIE: js.Function0[scala.Boolean],
    murmurhash3_32_gc: js.Function2[java.lang.String, scala.Double, scala.Double]
  ): Fingerprint = {
    val __obj = js.Dynamic.literal(get = get, getCanvasFingerprint = getCanvasFingerprint, getIEPluginsString = getIEPluginsString, getPluginsString = getPluginsString, getRegularPluginsString = getRegularPluginsString, getScreenResolution = getScreenResolution, hasLocalStorage = hasLocalStorage, hasSessionStorage = hasSessionStorage, isCanvasSupported = isCanvasSupported, isIE = isIE, murmurhash3_32_gc = murmurhash3_32_gc)
  
    __obj.asInstanceOf[Fingerprint]
  }
}

