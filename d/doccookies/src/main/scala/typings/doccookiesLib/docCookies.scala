package typings
package doccookiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait docCookies extends js.Object {
  /**
    Read a cookie. If the cookie doesn't exist a null value will be returned.
    @param {string} name (required) The name of the cookie to read 
    */
  def getItem(sKey: java.lang.String): java.lang.String = js.native
  /**
    Check if a cookie exists.
    @param {string} name (required) The name of the cookie to test
    */
  def hasItem(sKey: java.lang.String): scala.Boolean = js.native
  /**
    Returns an array of all readable cookies from this location.
    */
  def keys(): js.Array[java.lang.String] = js.native
  /**
    Delete a cookie.
    @param {string} name (required) The name of the cookie to remove 
    */
  def removeItem(sKey: java.lang.String): scala.Boolean = js.native
  def removeItem(sKey: java.lang.String, sPath: java.lang.String): scala.Boolean = js.native
  /**
    Create/overwrite a cookie.
    @param {string} name (required) The name of the cookie to create/overwrite 
    @param {string} value (required) The value of the cookie 
    @param {number} end (optional) The max-age in seconds (e.g. 31536e3 for a year, Infinity for a never-expires cookie). If not specified it will expire at the end of session
    @param {string} path (optional) E.g., "/", "/mydir"; if not specified, defaults to the current path of the current document location
    @param {string} domain (optional) E.g., "example.com", ".example.com" (includes all subdomains) or "subdomain.example.com"; if not specified, defaults to the host portion of the current document location
    @param {boolean} secure (optional) The cookie will be transmitted only over secure protocol as https
    */   
  def setItem(sKey: java.lang.String, sValue: java.lang.String): scala.Boolean = js.native
  def setItem(sKey: java.lang.String, sValue: java.lang.String, vEnd: java.lang.String): scala.Boolean = js.native
  def setItem(sKey: java.lang.String, sValue: java.lang.String, vEnd: java.lang.String, sPath: java.lang.String): scala.Boolean = js.native
  def setItem(
    sKey: java.lang.String,
    sValue: java.lang.String,
    vEnd: java.lang.String,
    sPath: java.lang.String,
    sDomain: java.lang.String
  ): scala.Boolean = js.native
  def setItem(
    sKey: java.lang.String,
    sValue: java.lang.String,
    vEnd: java.lang.String,
    sPath: java.lang.String,
    sDomain: java.lang.String,
    bSecure: scala.Boolean
  ): scala.Boolean = js.native
  def setItem(sKey: java.lang.String, sValue: java.lang.String, vEnd: scala.Double): scala.Boolean = js.native
  def setItem(sKey: java.lang.String, sValue: java.lang.String, vEnd: scala.Double, sPath: java.lang.String): scala.Boolean = js.native
  def setItem(
    sKey: java.lang.String,
    sValue: java.lang.String,
    vEnd: scala.Double,
    sPath: java.lang.String,
    sDomain: java.lang.String
  ): scala.Boolean = js.native
  def setItem(
    sKey: java.lang.String,
    sValue: java.lang.String,
    vEnd: scala.Double,
    sPath: java.lang.String,
    sDomain: java.lang.String,
    bSecure: scala.Boolean
  ): scala.Boolean = js.native
  def setItem(sKey: java.lang.String, sValue: java.lang.String, vEnd: stdLib.Date): scala.Boolean = js.native
  def setItem(sKey: java.lang.String, sValue: java.lang.String, vEnd: stdLib.Date, sPath: java.lang.String): scala.Boolean = js.native
  def setItem(
    sKey: java.lang.String,
    sValue: java.lang.String,
    vEnd: stdLib.Date,
    sPath: java.lang.String,
    sDomain: java.lang.String
  ): scala.Boolean = js.native
  def setItem(
    sKey: java.lang.String,
    sValue: java.lang.String,
    vEnd: stdLib.Date,
    sPath: java.lang.String,
    sDomain: java.lang.String,
    bSecure: scala.Boolean
  ): scala.Boolean = js.native
}

