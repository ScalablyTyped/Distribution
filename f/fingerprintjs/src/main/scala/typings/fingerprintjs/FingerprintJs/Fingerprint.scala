package typings.fingerprintjs.FingerprintJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fingerprint extends js.Object {
  /**
    * Generate fingerprint number.
    */
  def get(): Double = js.native
  /**
    * Get canvas data url string.
    */
  def getCanvasFingerprint(): String = js.native
  /**
    * Get plugins string from ActiveXObject.
    */
  def getIEPluginsString(): String = js.native
  /**
    * Get plugins string.
    */
  def getPluginsString(): String = js.native
  /**
    * Get plugins string from navigator plugins.
    */
  def getRegularPluginsString(): String = js.native
  /**
    * Get screen height and width.
    */
  def getScreenResolution(): js.Array[Double] = js.native
  /**
    * Check whether or not the browser has local storage.
    */
  def hasLocalStorage(): Boolean = js.native
  /**
    * Check whether or not the browser has session storage.
    */
  def hasSessionStorage(): Boolean = js.native
  /**
    * Check whether or not the browser supports canvas.
    */
  def isCanvasSupported(): Boolean = js.native
  /**
    * Check whether or not the browser is IE.
    */
  def isIE(): Boolean = js.native
  /**
    * Generate fingerprint number using Murmur hashing.
    * @param key ASCII only
    * @param seed Positive integer only
    */
  def murmurhash3_32_gc(key: String, seed: Double): Double = js.native
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
  @scala.inline
  implicit class FingerprintOps[Self <: Fingerprint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: () => Double): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCanvasFingerprint(value: () => String): Self = this.set("getCanvasFingerprint", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIEPluginsString(value: () => String): Self = this.set("getIEPluginsString", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPluginsString(value: () => String): Self = this.set("getPluginsString", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRegularPluginsString(value: () => String): Self = this.set("getRegularPluginsString", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScreenResolution(value: () => js.Array[Double]): Self = this.set("getScreenResolution", js.Any.fromFunction0(value))
    @scala.inline
    def setHasLocalStorage(value: () => Boolean): Self = this.set("hasLocalStorage", js.Any.fromFunction0(value))
    @scala.inline
    def setHasSessionStorage(value: () => Boolean): Self = this.set("hasSessionStorage", js.Any.fromFunction0(value))
    @scala.inline
    def setIsCanvasSupported(value: () => Boolean): Self = this.set("isCanvasSupported", js.Any.fromFunction0(value))
    @scala.inline
    def setIsIE(value: () => Boolean): Self = this.set("isIE", js.Any.fromFunction0(value))
    @scala.inline
    def setMurmurhash3_32_gc(value: (String, Double) => Double): Self = this.set("murmurhash3_32_gc", js.Any.fromFunction2(value))
  }
  
}

