package typings.faker

import typings.faker.anon.Abbreviation
import typings.faker.anon.Abstract
import typings.faker.anon.Account
import typings.faker.anon.Alpha
import typings.faker.anon.Avatar
import typings.faker.anon.Between
import typings.faker.anon.Branch
import typings.faker.anon.Bs
import typings.faker.anon.CardinalDirection
import typings.faker.anon.Collation
import typings.faker.anon.Color
import typings.faker.anon.CommonFileExt
import typings.faker.anon.FindName
import typings.faker.anon.Fuel
import typings.faker.anon.Genre
import typings.faker.anon.Lines
import typings.faker.anon.PhoneFormats
import typings.faker.anon.Recent
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Faker {
  
  trait Address extends StObject {
    
    var city: String
    
    var geo: Geo
    
    var state: String
    
    var street: String
    
    var suite: String
    
    var zipcode: String
  }
  object Address {
    
    @scala.inline
    def apply(city: String, geo: Geo, state: String, street: String, suite: String, zipcode: String): Address = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], geo = geo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any], zipcode = zipcode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeo(value: Geo): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuite(value: String): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipcode(value: String): Self = StObject.set(x, "zipcode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Card extends StObject {
    
    var accountHistory: js.Array[String]
    
    var address: FullAddress
    
    var company: Company
    
    var email: String
    
    var name: String
    
    var phone: String
    
    var posts: js.Array[Post]
    
    var username: String
    
    var website: String
  }
  object Card {
    
    @scala.inline
    def apply(
      accountHistory: js.Array[String],
      address: FullAddress,
      company: Company,
      email: String,
      name: String,
      phone: String,
      posts: js.Array[Post],
      username: String,
      website: String
    ): Card = {
      val __obj = js.Dynamic.literal(accountHistory = accountHistory.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
      __obj.asInstanceOf[Card]
    }
    
    @scala.inline
    implicit class CardMutableBuilder[Self <: Card] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountHistory(value: js.Array[String]): Self = StObject.set(x, "accountHistory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountHistoryVarargs(value: String*): Self = StObject.set(x, "accountHistory", js.Array(value :_*))
      
      @scala.inline
      def setAddress(value: FullAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompany(value: Company): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosts(value: js.Array[Post]): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostsVarargs(value: Post*): Self = StObject.set(x, "posts", js.Array(value :_*))
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    }
  }
  
  trait Company extends StObject {
    
    var bs: String
    
    var catchPhrase: String
    
    var name: String
  }
  object Company {
    
    @scala.inline
    def apply(bs: String, catchPhrase: String, name: String): Company = {
      val __obj = js.Dynamic.literal(bs = bs.asInstanceOf[js.Any], catchPhrase = catchPhrase.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Company]
    }
    
    @scala.inline
    implicit class CompanyMutableBuilder[Self <: Company] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBs(value: String): Self = StObject.set(x, "bs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatchPhrase(value: String): Self = StObject.set(x, "catchPhrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextualCard extends StObject {
    
    var address: Address
    
    var avatar: String
    
    var company: Company
    
    var dob: Date
    
    var email: String
    
    var name: String
    
    var phone: String
    
    var username: String
    
    var website: String
  }
  object ContextualCard {
    
    @scala.inline
    def apply(
      address: Address,
      avatar: String,
      company: Company,
      dob: Date,
      email: String,
      name: String,
      phone: String,
      username: String,
      website: String
    ): ContextualCard = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], dob = dob.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextualCard]
    }
    
    @scala.inline
    implicit class ContextualCardMutableBuilder[Self <: ContextualCard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompany(value: Company): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDob(value: Date): Self = StObject.set(x, "dob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    }
  }
  
  trait FakerStatic extends StObject {
    
    var address: CardinalDirection
    
    var commerce: Color
    
    var company: Bs
    
    var database: Collation
    
    var date: Between
    
    def fake(str: String): String
    
    var finance: Account
    
    var git: Branch
    
    var hacker: Abbreviation
    
    var helpers: typings.faker.anon.ContextualCard
    
    var image: Abstract
    
    var internet: Avatar
    
    var locale: String
    
    var lorem: Lines
    
    var music: Genre
    
    var name: FindName
    
    var phone: PhoneFormats
    
    var random: Alpha
    
    def seed(value: Double): Unit
    
    var seedValue: js.UndefOr[Double] = js.undefined
    
    def setLocale(locale: String): Unit
    
    var system: CommonFileExt
    
    var time: Recent
    
    var vehicle: Fuel
  }
  object FakerStatic {
    
    @scala.inline
    def apply(
      address: CardinalDirection,
      commerce: Color,
      company: Bs,
      database: Collation,
      date: Between,
      fake: String => String,
      finance: Account,
      git: Branch,
      hacker: Abbreviation,
      helpers: typings.faker.anon.ContextualCard,
      image: Abstract,
      internet: Avatar,
      locale: String,
      lorem: Lines,
      music: Genre,
      name: FindName,
      phone: PhoneFormats,
      random: Alpha,
      seed: Double => Unit,
      setLocale: String => Unit,
      system: CommonFileExt,
      time: Recent,
      vehicle: Fuel
    ): FakerStatic = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], commerce = commerce.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fake = js.Any.fromFunction1(fake), finance = finance.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], hacker = hacker.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], internet = internet.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], lorem = lorem.asInstanceOf[js.Any], music = music.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], seed = js.Any.fromFunction1(seed), setLocale = js.Any.fromFunction1(setLocale), system = system.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any])
      __obj.asInstanceOf[FakerStatic]
    }
    
    @scala.inline
    implicit class FakerStaticMutableBuilder[Self <: FakerStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: CardinalDirection): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommerce(value: Color): Self = StObject.set(x, "commerce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompany(value: Bs): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabase(value: Collation): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: Between): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFake(value: String => String): Self = StObject.set(x, "fake", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFinance(value: Account): Self = StObject.set(x, "finance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGit(value: Branch): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHacker(value: Abbreviation): Self = StObject.set(x, "hacker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpers(value: typings.faker.anon.ContextualCard): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: Abstract): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternet(value: Avatar): Self = StObject.set(x, "internet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLorem(value: Lines): Self = StObject.set(x, "lorem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMusic(value: Genre): Self = StObject.set(x, "music", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: FindName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: PhoneFormats): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandom(value: Alpha): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeed(value: Double => Unit): Self = StObject.set(x, "seed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSeedValue(value: Double): Self = StObject.set(x, "seedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedValueUndefined: Self = StObject.set(x, "seedValue", js.undefined)
      
      @scala.inline
      def setSetLocale(value: String => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSystem(value: CommonFileExt): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Recent): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVehicle(value: Fuel): Self = StObject.set(x, "vehicle", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullAddress extends StObject {
    
    var city: String
    
    var county: String
    
    var geo: Geo
    
    var state: String
    
    var streetA: String
    
    var streetB: String
    
    var streetC: String
    
    var streetD: String
    
    var zipcode: String
  }
  object FullAddress {
    
    @scala.inline
    def apply(
      city: String,
      county: String,
      geo: Geo,
      state: String,
      streetA: String,
      streetB: String,
      streetC: String,
      streetD: String,
      zipcode: String
    ): FullAddress = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], county = county.asInstanceOf[js.Any], geo = geo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streetA = streetA.asInstanceOf[js.Any], streetB = streetB.asInstanceOf[js.Any], streetC = streetC.asInstanceOf[js.Any], streetD = streetD.asInstanceOf[js.Any], zipcode = zipcode.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullAddress]
    }
    
    @scala.inline
    implicit class FullAddressMutableBuilder[Self <: FullAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCounty(value: String): Self = StObject.set(x, "county", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeo(value: Geo): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreetA(value: String): Self = StObject.set(x, "streetA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreetB(value: String): Self = StObject.set(x, "streetB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreetC(value: String): Self = StObject.set(x, "streetC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreetD(value: String): Self = StObject.set(x, "streetD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipcode(value: String): Self = StObject.set(x, "zipcode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Geo extends StObject {
    
    var lat: String
    
    var lng: String
  }
  object Geo {
    
    @scala.inline
    def apply(lat: String, lng: String): Geo = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geo]
    }
    
    @scala.inline
    implicit class GeoMutableBuilder[Self <: Geo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLat(value: String): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLng(value: String): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  trait Post extends StObject {
    
    var paragraph: String
    
    var sentence: String
    
    var sentences: String
    
    var words: String
  }
  object Post {
    
    @scala.inline
    def apply(paragraph: String, sentence: String, sentences: String, words: String): Post = {
      val __obj = js.Dynamic.literal(paragraph = paragraph.asInstanceOf[js.Any], sentence = sentence.asInstanceOf[js.Any], sentences = sentences.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Post]
    }
    
    @scala.inline
    implicit class PostMutableBuilder[Self <: Post] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParagraph(value: String): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSentence(value: String): Self = StObject.set(x, "sentence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSentences(value: String): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWords(value: String): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transaction extends StObject {
    
    var account: String
    
    var amount: String
    
    var business: String
    
    var date: Date
    
    var name: String
    
    var `type`: String
  }
  object Transaction {
    
    @scala.inline
    def apply(account: String, amount: String, business: String, date: Date, name: String, `type`: String): Transaction = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], business = business.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transaction]
    }
    
    @scala.inline
    implicit class TransactionMutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusiness(value: String): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserCard extends StObject {
    
    var address: Address
    
    var company: Company
    
    var email: String
    
    var name: String
    
    var phone: String
    
    var username: String
    
    var website: String
  }
  object UserCard {
    
    @scala.inline
    def apply(
      address: Address,
      company: Company,
      email: String,
      name: String,
      phone: String,
      username: String,
      website: String
    ): UserCard = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserCard]
    }
    
    @scala.inline
    implicit class UserCardMutableBuilder[Self <: UserCard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompany(value: Company): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    }
  }
}
