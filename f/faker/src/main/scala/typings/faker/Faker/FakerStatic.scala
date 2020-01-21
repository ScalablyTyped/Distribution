package typings.faker.Faker

import typings.faker.AnonAbbreviation
import typings.faker.AnonAbstract
import typings.faker.AnonAccount
import typings.faker.AnonAlphaNumeric
import typings.faker.AnonArgs
import typings.faker.AnonAvatar
import typings.faker.AnonBetween
import typings.faker.AnonBranch
import typings.faker.AnonBs
import typings.faker.AnonCity
import typings.faker.AnonCollation
import typings.faker.AnonColor
import typings.faker.AnonColorFuel
import typings.faker.AnonCommonFileExt
import typings.faker.AnonFindName
import typings.faker.AnonFormat
import typings.faker.AnonLineCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakerStatic extends js.Object {
  var address: AnonCity
  var commerce: AnonColor
  var company: AnonBs
  var database: AnonCollation
  var date: AnonBetween
  var finance: AnonAccount
  var git: AnonBranch
  var hacker: AnonAbbreviation
  var helpers: AnonArgs
  var image: AnonAbstract
  var internet: AnonAvatar
  var locale: String
  var lorem: AnonLineCount
  var name: AnonFindName
  var phone: AnonFormat
  var random: AnonAlphaNumeric
  var seedValue: js.UndefOr[Double] = js.undefined
  var system: AnonCommonFileExt
  var vehicle: AnonColorFuel
  def fake(str: String): String
  def seed(value: Double): Unit
  def setLocale(locale: String): Unit
}

object FakerStatic {
  @scala.inline
  def apply(
    address: AnonCity,
    commerce: AnonColor,
    company: AnonBs,
    database: AnonCollation,
    date: AnonBetween,
    fake: String => String,
    finance: AnonAccount,
    git: AnonBranch,
    hacker: AnonAbbreviation,
    helpers: AnonArgs,
    image: AnonAbstract,
    internet: AnonAvatar,
    locale: String,
    lorem: AnonLineCount,
    name: AnonFindName,
    phone: AnonFormat,
    random: AnonAlphaNumeric,
    seed: Double => Unit,
    setLocale: String => Unit,
    system: AnonCommonFileExt,
    vehicle: AnonColorFuel,
    seedValue: Int | Double = null
  ): FakerStatic = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], commerce = commerce.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fake = js.Any.fromFunction1(fake), finance = finance.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], hacker = hacker.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], internet = internet.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], lorem = lorem.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], seed = js.Any.fromFunction1(seed), setLocale = js.Any.fromFunction1(setLocale), system = system.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any])
    if (seedValue != null) __obj.updateDynamic("seedValue")(seedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FakerStatic]
  }
}

