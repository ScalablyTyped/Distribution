package typings.doccookies

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait docCookies extends js.Object {
  /**
    Read a cookie. If the cookie doesn't exist a null value will be returned.
    @param {string} name (required) The name of the cookie to read 
    */
  def getItem(sKey: String): String = js.native
  /**
    Check if a cookie exists.
    @param {string} name (required) The name of the cookie to test
    */
  def hasItem(sKey: String): Boolean = js.native
  /**
    Returns an array of all readable cookies from this location.
    */
  def keys(): js.Array[String] = js.native
  /**
    Delete a cookie.
    @param {string} name (required) The name of the cookie to remove 
    */
  def removeItem(sKey: String): Boolean = js.native
  def removeItem(sKey: String, sPath: String): Boolean = js.native
  /**
    Create/overwrite a cookie.
    @param {string} name (required) The name of the cookie to create/overwrite 
    @param {string} value (required) The value of the cookie 
    @param {number} end (optional) The max-age in seconds (e.g. 31536e3 for a year, Infinity for a never-expires cookie). If not specified it will expire at the end of session
    @param {string} path (optional) E.g., "/", "/mydir"; if not specified, defaults to the current path of the current document location
    @param {string} domain (optional) E.g., "example.com", ".example.com" (includes all subdomains) or "subdomain.example.com"; if not specified, defaults to the host portion of the current document location
    @param {boolean} secure (optional) The cookie will be transmitted only over secure protocol as https
    */   
  def setItem(sKey: String, sValue: String): Boolean = js.native
  def setItem(sKey: String, sValue: String, vEnd: String): Boolean = js.native
  def setItem(sKey: String, sValue: String, vEnd: String, sPath: String): Boolean = js.native
  def setItem(sKey: String, sValue: String, vEnd: String, sPath: String, sDomain: String): Boolean = js.native
  def setItem(sKey: String, sValue: String, vEnd: String, sPath: String, sDomain: String, bSecure: Boolean): Boolean = js.native
  def setItem(sKey: String, sValue: String, vEnd: Double): Boolean = js.native
  def setItem(sKey: String, sValue: String, vEnd: Double, sPath: String): Boolean = js.native
  def setItem(sKey: String, sValue: String, vEnd: Double, sPath: String, sDomain: String): Boolean = js.native
  def setItem(sKey: String, sValue: String, vEnd: Double, sPath: String, sDomain: String, bSecure: Boolean): Boolean = js.native
  def setItem(sKey: String, sValue: String, vEnd: Date): Boolean = js.native
  def setItem(sKey: String, sValue: String, vEnd: Date, sPath: String): Boolean = js.native
  def setItem(sKey: String, sValue: String, vEnd: Date, sPath: String, sDomain: String): Boolean = js.native
  def setItem(sKey: String, sValue: String, vEnd: Date, sPath: String, sDomain: String, bSecure: Boolean): Boolean = js.native
}

