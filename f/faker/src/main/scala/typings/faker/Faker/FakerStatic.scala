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

@js.native
trait FakerStatic extends js.Object {
  var address: City = js.native
  var commerce: Color = js.native
  var company: Bs = js.native
  var database: Collation = js.native
  var date: Between = js.native
  var finance: Account = js.native
  var hacker: Abbreviation = js.native
  var helpers: typings.faker.anon.ContextualCard = js.native
  var image: Abstract = js.native
  var internet: Avatar = js.native
  var locale: String = js.native
  var lorem: Lines = js.native
  var name: FindName = js.native
  var phone: PhoneFormats = js.native
  var random: AlphaNumeric = js.native
  var seedValue: js.UndefOr[Double] = js.native
  var system: CommonFileExt = js.native
  def fake(str: String): String = js.native
  def seed(value: Double): Unit = js.native
  def setLocale(locale: String): Unit = js.native
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
    system: CommonFileExt
  ): FakerStatic = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], commerce = commerce.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fake = js.Any.fromFunction1(fake), finance = finance.asInstanceOf[js.Any], hacker = hacker.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], internet = internet.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], lorem = lorem.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], seed = js.Any.fromFunction1(seed), setLocale = js.Any.fromFunction1(setLocale), system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[FakerStatic]
  }
  @scala.inline
  implicit class FakerStaticOps[Self <: FakerStatic] (val x: Self) extends AnyVal {
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
    def setAddress(value: City): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommerce(value: Color): Self = this.set("commerce", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompany(value: Bs): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabase(value: Collation): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Between): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setFake(value: String => String): Self = this.set("fake", js.Any.fromFunction1(value))
    @scala.inline
    def setFinance(value: Account): Self = this.set("finance", value.asInstanceOf[js.Any])
    @scala.inline
    def setHacker(value: Abbreviation): Self = this.set("hacker", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelpers(value: typings.faker.anon.ContextualCard): Self = this.set("helpers", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: Abstract): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternet(value: Avatar): Self = this.set("internet", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setLorem(value: Lines): Self = this.set("lorem", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: FindName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: PhoneFormats): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setRandom(value: AlphaNumeric): Self = this.set("random", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeed(value: Double => Unit): Self = this.set("seed", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLocale(value: String => Unit): Self = this.set("setLocale", js.Any.fromFunction1(value))
    @scala.inline
    def setSystem(value: CommonFileExt): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeedValue(value: Double): Self = this.set("seedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeedValue: Self = this.set("seedValue", js.undefined)
  }
  
}

