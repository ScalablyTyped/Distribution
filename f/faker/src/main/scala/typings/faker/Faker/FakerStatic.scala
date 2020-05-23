package typings.faker.Faker

import typings.faker.anon.Abbreviation
import typings.faker.anon.Abstract
import typings.faker.anon.Account
import typings.faker.anon.AlphaNumeric
import typings.faker.anon.Avatar
import typings.faker.anon.Between
import typings.faker.anon.Bs
import typings.faker.anon.City
import typings.faker.anon.Collation
import typings.faker.anon.Color
import typings.faker.anon.CommonFileExt
import typings.faker.anon.FindName
import typings.faker.anon.Lines
import typings.faker.anon.PhoneFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakerStatic extends js.Object {
  var address: City
  var commerce: Color
  var company: Bs
  var database: Collation
  var date: Between
  var finance: Account
  var hacker: Abbreviation
  var helpers: typings.faker.anon.ContextualCard
  var image: Abstract
  var internet: Avatar
  var locale: String
  var lorem: Lines
  var name: FindName
  var phone: PhoneFormats
  var random: AlphaNumeric
  var seedValue: js.UndefOr[Double] = js.undefined
  var system: CommonFileExt
  def fake(str: String): String
  def seed(value: Double): Unit
  def setLocale(locale: String): Unit
}

object FakerStatic {
  @scala.inline
  def apply(
    address: City,
    commerce: Color,
    company: Bs,
    database: Collation,
    date: Between,
    fake: String => String,
    finance: Account,
    hacker: Abbreviation,
    helpers: typings.faker.anon.ContextualCard,
    image: Abstract,
    internet: Avatar,
    locale: String,
    lorem: Lines,
    name: FindName,
    phone: PhoneFormats,
    random: AlphaNumeric,
    seed: Double => Unit,
    setLocale: String => Unit,
    system: CommonFileExt,
    seedValue: js.UndefOr[Double] = js.undefined
  ): FakerStatic = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], commerce = commerce.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fake = js.Any.fromFunction1(fake), finance = finance.asInstanceOf[js.Any], hacker = hacker.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], internet = internet.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], lorem = lorem.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], seed = js.Any.fromFunction1(seed), setLocale = js.Any.fromFunction1(setLocale), system = system.asInstanceOf[js.Any])
    if (!js.isUndefined(seedValue)) __obj.updateDynamic("seedValue")(seedValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FakerStatic]
  }
}

