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
    get: () => scala.Double,
    getCanvasFingerprint: () => java.lang.String,
    getIEPluginsString: () => java.lang.String,
    getPluginsString: () => java.lang.String,
    getRegularPluginsString: () => java.lang.String,
    getScreenResolution: () => js.Array[scala.Double],
    hasLocalStorage: () => scala.Boolean,
    hasSessionStorage: () => scala.Boolean,
    isCanvasSupported: () => scala.Boolean,
    isIE: () => scala.Boolean,
    murmurhash3_32_gc: (java.lang.String, scala.Double) => scala.Double
  ): Fingerprint = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), getCanvasFingerprint = js.Any.fromFunction0(getCanvasFingerprint), getIEPluginsString = js.Any.fromFunction0(getIEPluginsString), getPluginsString = js.Any.fromFunction0(getPluginsString), getRegularPluginsString = js.Any.fromFunction0(getRegularPluginsString), getScreenResolution = js.Any.fromFunction0(getScreenResolution), hasLocalStorage = js.Any.fromFunction0(hasLocalStorage), hasSessionStorage = js.Any.fromFunction0(hasSessionStorage), isCanvasSupported = js.Any.fromFunction0(isCanvasSupported), isIE = js.Any.fromFunction0(isIE), murmurhash3_32_gc = js.Any.fromFunction2(murmurhash3_32_gc))
  
    __obj.asInstanceOf[Fingerprint]
  }
}

