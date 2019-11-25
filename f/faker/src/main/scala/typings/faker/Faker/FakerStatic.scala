package typings.faker.Faker

import typings.faker.Anon_Abbreviation
import typings.faker.Anon_Abstract
import typings.faker.Anon_Account
import typings.faker.Anon_AlphaNumeric
import typings.faker.Anon_Args
import typings.faker.Anon_Avatar
import typings.faker.Anon_Between
import typings.faker.Anon_Branch
import typings.faker.Anon_Bs
import typings.faker.Anon_City
import typings.faker.Anon_Collation
import typings.faker.Anon_Color
import typings.faker.Anon_ColorFuel
import typings.faker.Anon_CommonFileExt
import typings.faker.Anon_FindName
import typings.faker.Anon_Format
import typings.faker.Anon_LineCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakerStatic extends js.Object {
  var address: Anon_City
  var commerce: Anon_Color
  var company: Anon_Bs
  var database: Anon_Collation
  var date: Anon_Between
  var finance: Anon_Account
  var git: Anon_Branch
  var hacker: Anon_Abbreviation
  var helpers: Anon_Args
  var image: Anon_Abstract
  var internet: Anon_Avatar
  var locale: String
  var lorem: Anon_LineCount
  var name: Anon_FindName
  var phone: Anon_Format
  var random: Anon_AlphaNumeric
  var system: Anon_CommonFileExt
  var vehicle: Anon_ColorFuel
  def fake(str: String): String
  def seed(value: Double): Unit
  def setLocale(locale: String): Unit
}

object FakerStatic {
  @scala.inline
  def apply(
    address: Anon_City,
    commerce: Anon_Color,
    company: Anon_Bs,
    database: Anon_Collation,
    date: Anon_Between,
    fake: String => String,
    finance: Anon_Account,
    git: Anon_Branch,
    hacker: Anon_Abbreviation,
    helpers: Anon_Args,
    image: Anon_Abstract,
    internet: Anon_Avatar,
    locale: String,
    lorem: Anon_LineCount,
    name: Anon_FindName,
    phone: Anon_Format,
    random: Anon_AlphaNumeric,
    seed: Double => Unit,
    setLocale: String => Unit,
    system: Anon_CommonFileExt,
    vehicle: Anon_ColorFuel
  ): FakerStatic = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], commerce = commerce.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fake = js.Any.fromFunction1(fake), finance = finance.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], hacker = hacker.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], internet = internet.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], lorem = lorem.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], seed = js.Any.fromFunction1(seed), setLocale = js.Any.fromFunction1(setLocale), system = system.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FakerStatic]
  }
}

