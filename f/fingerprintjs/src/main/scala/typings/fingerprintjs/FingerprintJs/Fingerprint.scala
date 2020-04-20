package typings.fingerprintjs.FingerprintJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fingerprint extends js.Object {
  /**
    * Generate fingerprint number.
    */
  def get(): Double
  /**
    * Get canvas data url string.
    */
  def getCanvasFingerprint(): String
  /**
    * Get plugins string from ActiveXObject.
    */
  def getIEPluginsString(): String
  /**
    * Get plugins string.
    */
  def getPluginsString(): String
  /**
    * Get plugins string from navigator plugins.
    */
  def getRegularPluginsString(): String
  /**
    * Get screen height and width.
    */
  def getScreenResolution(): js.Array[Double]
  /**
    * Check whether or not the browser has local storage.
    */
  def hasLocalStorage(): Boolean
  /**
    * Check whether or not the browser has session storage.
    */
  def hasSessionStorage(): Boolean
  /**
    * Check whether or not the browser supports canvas.
    */
  def isCanvasSupported(): Boolean
  /**
    * Check whether or not the browser is IE.
    */
  def isIE(): Boolean
  /**
    * Generate fingerprint number using Murmur hashing.
    * @param key ASCII only
    * @param seed Positive integer only
    */
  def murmurhash3_32_gc(key: String, seed: Double): Double
}

object Fingerprint {
  @scala.inline
  def apply(
    get: () => Double,
    getCanvasFingerprint: () => String,
    getIEPluginsString: () => String,
    getPluginsString: () => String,
    getRegularPluginsString: () => String,
    getScreenResolution: () => js.Array[Double],
    hasLocalStorage: () => Boolean,
    hasSessionStorage: () => Boolean,
    isCanvasSupported: () => Boolean,
    isIE: () => Boolean,
    murmurhash3_32_gc: (String, Double) => Double
  ): Fingerprint = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), getCanvasFingerprint = js.Any.fromFunction0(getCanvasFingerprint), getIEPluginsString = js.Any.fromFunction0(getIEPluginsString), getPluginsString = js.Any.fromFunction0(getPluginsString), getRegularPluginsString = js.Any.fromFunction0(getRegularPluginsString), getScreenResolution = js.Any.fromFunction0(getScreenResolution), hasLocalStorage = js.Any.fromFunction0(hasLocalStorage), hasSessionStorage = js.Any.fromFunction0(hasSessionStorage), isCanvasSupported = js.Any.fromFunction0(isCanvasSupported), isIE = js.Any.fromFunction0(isIE), murmurhash3_32_gc = js.Any.fromFunction2(murmurhash3_32_gc))
    __obj.asInstanceOf[Fingerprint]
  }
}

