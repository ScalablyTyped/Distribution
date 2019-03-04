package typings
package fakerLib.FakerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakerStatic extends js.Object {
  var address: fakerLib.Anon_City
  var commerce: fakerLib.Anon_Color
  var company: fakerLib.Anon_Bs
  var database: fakerLib.Anon_Collation
  var date: fakerLib.Anon_Between
  var finance: fakerLib.Anon_Account
  var hacker: fakerLib.Anon_Abbreviation
  var helpers: fakerLib.Anon_Args
  var image: fakerLib.Anon_Abstract
  var internet: fakerLib.Anon_Avatar
  var locale: java.lang.String
  var lorem: fakerLib.Anon_LineCount
  var name: fakerLib.Anon_FindName
  var phone: fakerLib.Anon_Format
  var random: fakerLib.Anon_AlphaNumeric
  var system: fakerLib.Anon_CommonFileExt
  def fake(str: java.lang.String): java.lang.String
  def seed(value: scala.Double): scala.Unit
  def setLocale(locale: java.lang.String): scala.Unit
}

object FakerStatic {
  @scala.inline
  def apply(
    address: fakerLib.Anon_City,
    commerce: fakerLib.Anon_Color,
    company: fakerLib.Anon_Bs,
    database: fakerLib.Anon_Collation,
    date: fakerLib.Anon_Between,
    fake: js.Function1[java.lang.String, java.lang.String],
    finance: fakerLib.Anon_Account,
    hacker: fakerLib.Anon_Abbreviation,
    helpers: fakerLib.Anon_Args,
    image: fakerLib.Anon_Abstract,
    internet: fakerLib.Anon_Avatar,
    locale: java.lang.String,
    lorem: fakerLib.Anon_LineCount,
    name: fakerLib.Anon_FindName,
    phone: fakerLib.Anon_Format,
    random: fakerLib.Anon_AlphaNumeric,
    seed: js.Function1[scala.Double, scala.Unit],
    setLocale: js.Function1[java.lang.String, scala.Unit],
    system: fakerLib.Anon_CommonFileExt
  ): FakerStatic = {
    val __obj = js.Dynamic.literal(address = address, commerce = commerce, company = company, database = database, date = date, fake = fake, finance = finance, hacker = hacker, helpers = helpers, image = image, internet = internet, locale = locale, lorem = lorem, name = name, phone = phone, random = random, seed = seed, setLocale = setLocale, system = system)
  
    __obj.asInstanceOf[FakerStatic]
  }
}

