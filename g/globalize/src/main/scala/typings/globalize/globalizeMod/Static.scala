package typings.globalize.globalizeMod

import org.scalablytyped.runtime.Instantiable1
import typings.cldrjs.mod.CldrStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static
  extends Shared
     with /**
  * Create a Globalize instance.
  * @param cldr Cldr instance of the instance.
  * @returns {Globalize} A Globalize instance
  */
/**
  * Create a Globalize instance.
  * @param {string} Locale string of the instance.
  * @returns {Globalize} A Globalize instance
  */
Instantiable1[(/* cldr */ CldrStatic) | (/* locale */ String), Globalize] {
  /**
    * Create a Globalize instance.
    * @param cldr Cldr instance of the instance.
    * @returns {Globalize} A Globalize instance
    */
  def apply(cldr: CldrStatic): Globalize = js.native
  /**
    * Create a Globalize instance.
    * @param {string} Locale string of the instance.
    * @returns {Globalize} A Globalize instance
    */
  def apply(locale: String): Globalize = js.native
  /**
    * Globalize.load( json, ... )
    * @param {Object} [JSON]
    * Load resolved or unresolved cldr data.
    * Somewhat equivalent to previous Globalize.addCultureInfo(...).
    */
  def load(json: js.Object): Unit = js.native
  /**
    * Load messages data.
    * @param {Object} json JSON object of messages data. Keys can use any character, except /, { and }. Values (i.e., the message content itself) can contain any character.
    * @returns {void}
    */
  def loadMessages(json: js.Object): Unit = js.native
  /**
    * Globalize.loadTimeZone ( ianaTzData, ... )
    * This method allows you to load IANA time zone data to enable options.timeZone feature on date formatters and parsers.
    * @param {Object} ianaTzData A JSON object with zdumped IANA timezone data. Get the data via https://github.com/rxaviers/iana-tz-data
    */
  def loadTimeZone(ianaTzData: js.Object): Unit = js.native
  /**
    * Globalize.locale()
    * Return the default Cldr instance.
    */
  def locale(): CldrStatic = js.native
  /**
    * Globalize.locale( cldr )
    * @param {Cldr} cldr [Cldr instance]
    * Set default Cldr instance
    * Return the default Cldr instance.
    */
  def locale(cldr: CldrStatic): CldrStatic = js.native
  /**
    * Globalize.locale( [locale] )
    * @param {string} locale
    * Set default Cldr instance
    * Return the default Cldr instance.
    */
  def locale(locale: String): CldrStatic = js.native
}

