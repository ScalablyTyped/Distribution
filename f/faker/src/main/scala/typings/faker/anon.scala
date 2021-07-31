package typings.faker

import org.scalablytyped.runtime.StringDictionary
import typings.faker.Faker.Card
import typings.faker.Faker.Transaction
import typings.faker.Faker.UserCard
import typings.faker.fakerStrings.abbr
import typings.faker.fakerStrings.key
import typings.faker.fakerStrings.unix
import typings.faker.fakerStrings.wide
import typings.std.Date
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abbr extends StObject {
    
    var abbr: js.UndefOr[Boolean] = js.undefined
    
    var context: js.UndefOr[Boolean] = js.undefined
  }
  object Abbr {
    
    @scala.inline
    def apply(): Abbr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Abbr]
    }
    
    @scala.inline
    implicit class AbbrMutableBuilder[Self <: Abbr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbbr(value: Boolean): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
      
      @scala.inline
      def setContext(value: Boolean): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  trait Abbreviation extends StObject {
    
    def abbreviation(): String
    
    def adjective(): String
    
    def ingverb(): String
    
    def noun(): String
    
    def phrase(): String
    
    def verb(): String
  }
  object Abbreviation {
    
    @scala.inline
    def apply(
      abbreviation: () => String,
      adjective: () => String,
      ingverb: () => String,
      noun: () => String,
      phrase: () => String,
      verb: () => String
    ): Abbreviation = {
      val __obj = js.Dynamic.literal(abbreviation = js.Any.fromFunction0(abbreviation), adjective = js.Any.fromFunction0(adjective), ingverb = js.Any.fromFunction0(ingverb), noun = js.Any.fromFunction0(noun), phrase = js.Any.fromFunction0(phrase), verb = js.Any.fromFunction0(verb))
      __obj.asInstanceOf[Abbreviation]
    }
    
    @scala.inline
    implicit class AbbreviationMutableBuilder[Self <: Abbreviation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbbreviation(value: () => String): Self = StObject.set(x, "abbreviation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAdjective(value: () => String): Self = StObject.set(x, "adjective", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIngverb(value: () => String): Self = StObject.set(x, "ingverb", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNoun(value: () => String): Self = StObject.set(x, "noun", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPhrase(value: () => String): Self = StObject.set(x, "phrase", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVerb(value: () => String): Self = StObject.set(x, "verb", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Abstract extends StObject {
    
    def `abstract`(): String = js.native
    def `abstract`(width: Double): String = js.native
    def `abstract`(width: Double, height: Double): String = js.native
    def `abstract`(width: Unit, height: Double): String = js.native
    
    def animals(): String = js.native
    def animals(width: Double): String = js.native
    def animals(width: Double, height: Double): String = js.native
    def animals(width: Unit, height: Double): String = js.native
    
    def avatar(): String = js.native
    
    def business(): String = js.native
    def business(width: Double): String = js.native
    def business(width: Double, height: Double): String = js.native
    def business(width: Unit, height: Double): String = js.native
    
    def cats(): String = js.native
    def cats(width: Double): String = js.native
    def cats(width: Double, height: Double): String = js.native
    def cats(width: Unit, height: Double): String = js.native
    
    def city(): String = js.native
    def city(width: Double): String = js.native
    def city(width: Double, height: Double): String = js.native
    def city(width: Unit, height: Double): String = js.native
    
    def dataUri(): String = js.native
    def dataUri(width: Double): String = js.native
    def dataUri(width: Double, height: Double): String = js.native
    def dataUri(width: Double, height: Double, color: String): String = js.native
    def dataUri(width: Double, height: Unit, color: String): String = js.native
    def dataUri(width: Unit, height: Double): String = js.native
    def dataUri(width: Unit, height: Double, color: String): String = js.native
    def dataUri(width: Unit, height: Unit, color: String): String = js.native
    
    def fashion(): String = js.native
    def fashion(width: Double): String = js.native
    def fashion(width: Double, height: Double): String = js.native
    def fashion(width: Unit, height: Double): String = js.native
    
    def food(): String = js.native
    def food(width: Double): String = js.native
    def food(width: Double, height: Double): String = js.native
    def food(width: Unit, height: Double): String = js.native
    
    def image(): String = js.native
    
    def imageUrl(): String = js.native
    def imageUrl(width: Double): String = js.native
    def imageUrl(width: Double, height: Double): String = js.native
    def imageUrl(width: Double, height: Double, category: String): String = js.native
    def imageUrl(width: Double, height: Double, category: String, randomize: Boolean): String = js.native
    def imageUrl(width: Double, height: Double, category: String, randomize: Boolean, https: Boolean): String = js.native
    def imageUrl(width: Double, height: Double, category: String, randomize: Unit, https: Boolean): String = js.native
    def imageUrl(width: Double, height: Double, category: Unit, randomize: Boolean): String = js.native
    def imageUrl(width: Double, height: Double, category: Unit, randomize: Boolean, https: Boolean): String = js.native
    def imageUrl(width: Double, height: Double, category: Unit, randomize: Unit, https: Boolean): String = js.native
    def imageUrl(width: Double, height: Unit, category: String): String = js.native
    def imageUrl(width: Double, height: Unit, category: String, randomize: Boolean): String = js.native
    def imageUrl(width: Double, height: Unit, category: String, randomize: Boolean, https: Boolean): String = js.native
    def imageUrl(width: Double, height: Unit, category: String, randomize: Unit, https: Boolean): String = js.native
    def imageUrl(width: Double, height: Unit, category: Unit, randomize: Boolean): String = js.native
    def imageUrl(width: Double, height: Unit, category: Unit, randomize: Boolean, https: Boolean): String = js.native
    def imageUrl(width: Double, height: Unit, category: Unit, randomize: Unit, https: Boolean): String = js.native
    def imageUrl(width: Unit, height: Double): String = js.native
    def imageUrl(width: Unit, height: Double, category: String): String = js.native
    def imageUrl(width: Unit, height: Double, category: String, randomize: Boolean): String = js.native
    def imageUrl(width: Unit, height: Double, category: String, randomize: Boolean, https: Boolean): String = js.native
    def imageUrl(width: Unit, height: Double, category: String, randomize: Unit, https: Boolean): String = js.native
    def imageUrl(width: Unit, height: Double, category: Unit, randomize: Boolean): String = js.native
    def imageUrl(width: Unit, height: Double, category: Unit, randomize: Boolean, https: Boolean): String = js.native
    def imageUrl(width: Unit, height: Double, category: Unit, randomize: Unit, https: Boolean): String = js.native
    def imageUrl(width: Unit, height: Unit, category: String): String = js.native
    def imageUrl(width: Unit, height: Unit, category: String, randomize: Boolean): String = js.native
    def imageUrl(width: Unit, height: Unit, category: String, randomize: Boolean, https: Boolean): String = js.native
    def imageUrl(width: Unit, height: Unit, category: String, randomize: Unit, https: Boolean): String = js.native
    def imageUrl(width: Unit, height: Unit, category: Unit, randomize: Boolean): String = js.native
    def imageUrl(width: Unit, height: Unit, category: Unit, randomize: Boolean, https: Boolean): String = js.native
    def imageUrl(width: Unit, height: Unit, category: Unit, randomize: Unit, https: Boolean): String = js.native
    
    def nature(): String = js.native
    def nature(width: Double): String = js.native
    def nature(width: Double, height: Double): String = js.native
    def nature(width: Unit, height: Double): String = js.native
    
    def nightlife(): String = js.native
    def nightlife(width: Double): String = js.native
    def nightlife(width: Double, height: Double): String = js.native
    def nightlife(width: Unit, height: Double): String = js.native
    
    def people(): String = js.native
    def people(width: Double): String = js.native
    def people(width: Double, height: Double): String = js.native
    def people(width: Unit, height: Double): String = js.native
    
    def sports(): String = js.native
    def sports(width: Double): String = js.native
    def sports(width: Double, height: Double): String = js.native
    def sports(width: Unit, height: Double): String = js.native
    
    def technics(): String = js.native
    def technics(width: Double): String = js.native
    def technics(width: Double, height: Double): String = js.native
    def technics(width: Unit, height: Double): String = js.native
    
    def transport(): String = js.native
    def transport(width: Double): String = js.native
    def transport(width: Double, height: Double): String = js.native
    def transport(width: Unit, height: Double): String = js.native
  }
  
  @js.native
  trait Account extends StObject {
    
    def account(): String = js.native
    def account(length: Double): String = js.native
    
    def accountName(): String = js.native
    
    def amount(): String = js.native
    def amount(min: Double): String = js.native
    def amount(min: Double, max: Double): String = js.native
    def amount(min: Double, max: Double, dec: Double): String = js.native
    def amount(min: Double, max: Double, dec: Double, symbol: String): String = js.native
    def amount(min: Double, max: Double, dec: Unit, symbol: String): String = js.native
    def amount(min: Double, max: Unit, dec: Double): String = js.native
    def amount(min: Double, max: Unit, dec: Double, symbol: String): String = js.native
    def amount(min: Double, max: Unit, dec: Unit, symbol: String): String = js.native
    def amount(min: Unit, max: Double): String = js.native
    def amount(min: Unit, max: Double, dec: Double): String = js.native
    def amount(min: Unit, max: Double, dec: Double, symbol: String): String = js.native
    def amount(min: Unit, max: Double, dec: Unit, symbol: String): String = js.native
    def amount(min: Unit, max: Unit, dec: Double): String = js.native
    def amount(min: Unit, max: Unit, dec: Double, symbol: String): String = js.native
    def amount(min: Unit, max: Unit, dec: Unit, symbol: String): String = js.native
    
    def bic(): String = js.native
    
    def bitcoinAddress(): String = js.native
    
    def creditCardCVV(): String = js.native
    
    def creditCardNumber(): String = js.native
    def creditCardNumber(provider: String): String = js.native
    
    def currencyCode(): String = js.native
    
    def currencyName(): String = js.native
    
    def currencySymbol(): String = js.native
    
    def ethereumAddress(): String = js.native
    
    def iban(): String = js.native
    def iban(formatted: Boolean): String = js.native
    
    def litecoinAddress(): String = js.native
    
    def mask(): String = js.native
    def mask(length: Double): String = js.native
    def mask(length: Double, parens: Boolean): String = js.native
    def mask(length: Double, parens: Boolean, elipsis: Boolean): String = js.native
    def mask(length: Double, parens: Unit, elipsis: Boolean): String = js.native
    def mask(length: Unit, parens: Boolean): String = js.native
    def mask(length: Unit, parens: Boolean, elipsis: Boolean): String = js.native
    def mask(length: Unit, parens: Unit, elipsis: Boolean): String = js.native
    
    def routingNumber(): String = js.native
    
    def transactionDescription(): String = js.native
    
    def transactionType(): String = js.native
  }
  
  @js.native
  trait Alpha extends StObject {
    
    def alpha(): String = js.native
    def alpha(options: Count): String = js.native
    
    def alphaNumeric(): String = js.native
    def alphaNumeric(count: Double): String = js.native
    
    def arrayElement(): String = js.native
    def arrayElement[T](array: js.Array[T]): T = js.native
    
    def arrayElements(): js.Array[String] = js.native
    def arrayElements(count: Double): js.Array[String] = js.native
    def arrayElements[T](array: js.Array[T]): js.Array[T] = js.native
    def arrayElements[T](array: js.Array[T], count: Double): js.Array[T] = js.native
    
    def boolean(): Boolean = js.native
    
    def float(): Double = js.native
    def float(max: Double): Double = js.native
    def float(options: Max): Double = js.native
    
    def hexaDecimal(): String = js.native
    def hexaDecimal(count: Double): String = js.native
    
    def image(): String = js.native
    
    def locale(): String = js.native
    
    def number(): Double = js.native
    def number(max: Double): Double = js.native
    def number(options: Max): Double = js.native
    
    def objectElement(): String = js.native
    def objectElement(`object`: StringDictionary[js.Any]): String = js.native
    def objectElement[T](`object`: StringDictionary[T], field: js.Any): T = js.native
    def objectElement[T](`object`: Unit, field: js.Any): T = js.native
    @JSName("objectElement")
    def objectElement_T_T[T](): T = js.native
    @JSName("objectElement")
    def objectElement_T_T[T](`object`: StringDictionary[T]): T = js.native
    @JSName("objectElement")
    def objectElement_key(`object`: StringDictionary[js.Any], field: key): String = js.native
    @JSName("objectElement")
    def objectElement_key(`object`: Unit, field: key): String = js.native
    
    def uuid(): String = js.native
    
    def word(): String = js.native
    def word(`type`: String): String = js.native
    
    def words(): String = js.native
    def words(count: Double): String = js.native
  }
  
  @js.native
  trait Avatar extends StObject {
    
    def avatar(): String = js.native
    
    def color(): String = js.native
    def color(baseRed255: Double): String = js.native
    def color(baseRed255: Double, baseGreen255: Double): String = js.native
    def color(baseRed255: Double, baseGreen255: Double, baseBlue255: Double): String = js.native
    def color(baseRed255: Double, baseGreen255: Unit, baseBlue255: Double): String = js.native
    def color(baseRed255: Unit, baseGreen255: Double): String = js.native
    def color(baseRed255: Unit, baseGreen255: Double, baseBlue255: Double): String = js.native
    def color(baseRed255: Unit, baseGreen255: Unit, baseBlue255: Double): String = js.native
    
    def domainName(): String = js.native
    
    def domainSuffix(): String = js.native
    
    def domainWord(): String = js.native
    
    def email(): String = js.native
    def email(firstName: String): String = js.native
    def email(firstName: String, lastName: String): String = js.native
    def email(firstName: String, lastName: String, provider: String): String = js.native
    def email(firstName: String, lastName: Unit, provider: String): String = js.native
    def email(firstName: Unit, lastName: String): String = js.native
    def email(firstName: Unit, lastName: String, provider: String): String = js.native
    def email(firstName: Unit, lastName: Unit, provider: String): String = js.native
    
    def exampleEmail(): String = js.native
    def exampleEmail(firstName: String): String = js.native
    def exampleEmail(firstName: String, lastName: String): String = js.native
    def exampleEmail(firstName: Unit, lastName: String): String = js.native
    
    def ip(): String = js.native
    
    def ipv6(): String = js.native
    
    def mac(): String = js.native
    def mac(sep: String): String = js.native
    
    def password(): String = js.native
    def password(len: Double): String = js.native
    def password(len: Double, memorable: Boolean): String = js.native
    def password(len: Double, memorable: Boolean, pattern: String): String = js.native
    def password(len: Double, memorable: Boolean, pattern: String, prefix: String): String = js.native
    def password(len: Double, memorable: Boolean, pattern: Unit, prefix: String): String = js.native
    def password(len: Double, memorable: Boolean, pattern: RegExp): String = js.native
    def password(len: Double, memorable: Boolean, pattern: RegExp, prefix: String): String = js.native
    def password(len: Double, memorable: Unit, pattern: String): String = js.native
    def password(len: Double, memorable: Unit, pattern: String, prefix: String): String = js.native
    def password(len: Double, memorable: Unit, pattern: Unit, prefix: String): String = js.native
    def password(len: Double, memorable: Unit, pattern: RegExp): String = js.native
    def password(len: Double, memorable: Unit, pattern: RegExp, prefix: String): String = js.native
    def password(len: Unit, memorable: Boolean): String = js.native
    def password(len: Unit, memorable: Boolean, pattern: String): String = js.native
    def password(len: Unit, memorable: Boolean, pattern: String, prefix: String): String = js.native
    def password(len: Unit, memorable: Boolean, pattern: Unit, prefix: String): String = js.native
    def password(len: Unit, memorable: Boolean, pattern: RegExp): String = js.native
    def password(len: Unit, memorable: Boolean, pattern: RegExp, prefix: String): String = js.native
    def password(len: Unit, memorable: Unit, pattern: String): String = js.native
    def password(len: Unit, memorable: Unit, pattern: String, prefix: String): String = js.native
    def password(len: Unit, memorable: Unit, pattern: Unit, prefix: String): String = js.native
    def password(len: Unit, memorable: Unit, pattern: RegExp): String = js.native
    def password(len: Unit, memorable: Unit, pattern: RegExp, prefix: String): String = js.native
    
    def protocol(): String = js.native
    
    def url(): String = js.native
    
    def userAgent(): String = js.native
    
    def userName(): String = js.native
    def userName(firstName: String): String = js.native
    def userName(firstName: String, lastName: String): String = js.native
    def userName(firstName: Unit, lastName: String): String = js.native
  }
  
  @js.native
  trait Between extends StObject {
    
    def between(from: String, to: String): Date = js.native
    def between(from: String, to: Date): Date = js.native
    def between(from: Double, to: String): Date = js.native
    def between(from: Double, to: Date): Date = js.native
    def between(from: Date, to: String): Date = js.native
    def between(from: Date, to: Date): Date = js.native
    
    def future(): Date = js.native
    def future(years: Double): Date = js.native
    def future(years: Double, refDate: String): Date = js.native
    def future(years: Double, refDate: Date): Date = js.native
    def future(years: Unit, refDate: String): Date = js.native
    def future(years: Unit, refDate: Date): Date = js.native
    
    def month(): String = js.native
    def month(options: Abbr): String = js.native
    
    def past(): Date = js.native
    def past(years: Double): Date = js.native
    def past(years: Double, refDate: String): Date = js.native
    def past(years: Double, refDate: Date): Date = js.native
    def past(years: Unit, refDate: String): Date = js.native
    def past(years: Unit, refDate: Date): Date = js.native
    
    def recent(): Date = js.native
    def recent(days: Double): Date = js.native
    def recent(days: Double, refDate: String): Date = js.native
    def recent(days: Double, refDate: Date): Date = js.native
    def recent(days: Unit, refDate: String): Date = js.native
    def recent(days: Unit, refDate: Date): Date = js.native
    
    def soon(): Date = js.native
    def soon(days: Double): Date = js.native
    def soon(days: Double, refDate: String): Date = js.native
    def soon(days: Double, refDate: Date): Date = js.native
    def soon(days: Unit, refDate: String): Date = js.native
    def soon(days: Unit, refDate: Date): Date = js.native
    
    def weekday(): String = js.native
    def weekday(options: Abbr): String = js.native
  }
  
  @js.native
  trait Branch extends StObject {
    
    def branch(): String = js.native
    
    def commitEntry(): String = js.native
    def commitEntry(options: Merge): String = js.native
    
    def commitMessage(): String = js.native
    
    def commitSha(): String = js.native
    
    def shortSha(): String = js.native
  }
  
  @js.native
  trait Bs extends StObject {
    
    def bs(): String = js.native
    
    def bsAdjective(): String = js.native
    
    def bsBuzz(): String = js.native
    
    def bsNoun(): String = js.native
    
    def catchPhrase(): String = js.native
    
    def catchPhraseAdjective(): String = js.native
    
    def catchPhraseDescriptor(): String = js.native
    
    def catchPhraseNoun(): String = js.native
    
    def companyName(): String = js.native
    def companyName(format: Double): String = js.native
    
    def companySuffix(): String = js.native
    
    def suffixes(): js.Array[String] = js.native
  }
  
  @js.native
  trait CardinalDirection extends StObject {
    
    def cardinalDirection(): String = js.native
    def cardinalDirection(useAbbr: Boolean): String = js.native
    
    def city(): String = js.native
    def city(format: Double): String = js.native
    
    def cityPrefix(): String = js.native
    
    def citySuffix(): String = js.native
    
    def country(): String = js.native
    
    def countryCode(): String = js.native
    def countryCode(alphaCode: String): String = js.native
    
    def county(): String = js.native
    
    def direction(): String = js.native
    def direction(useAbbr: Boolean): String = js.native
    
    def latitude(): String = js.native
    def latitude(max: Double): String = js.native
    def latitude(max: Double, min: Double): String = js.native
    def latitude(max: Double, min: Double, precision: Double): String = js.native
    def latitude(max: Double, min: Unit, precision: Double): String = js.native
    def latitude(max: Unit, min: Double): String = js.native
    def latitude(max: Unit, min: Double, precision: Double): String = js.native
    def latitude(max: Unit, min: Unit, precision: Double): String = js.native
    
    def longitude(): String = js.native
    def longitude(max: Double): String = js.native
    def longitude(max: Double, min: Double): String = js.native
    def longitude(max: Double, min: Double, precision: Double): String = js.native
    def longitude(max: Double, min: Unit, precision: Double): String = js.native
    def longitude(max: Unit, min: Double): String = js.native
    def longitude(max: Unit, min: Double, precision: Double): String = js.native
    def longitude(max: Unit, min: Unit, precision: Double): String = js.native
    
    def nearbyGPSCoordinate(): js.Array[String] = js.native
    def nearbyGPSCoordinate(coordinate: String): js.Array[String] = js.native
    def nearbyGPSCoordinate(coordinate: String, radius: Double): js.Array[String] = js.native
    def nearbyGPSCoordinate(coordinate: String, radius: Double, isMetric: Boolean): js.Array[String] = js.native
    def nearbyGPSCoordinate(coordinate: String, radius: Unit, isMetric: Boolean): js.Array[String] = js.native
    def nearbyGPSCoordinate(coordinate: Unit, radius: Double): js.Array[String] = js.native
    def nearbyGPSCoordinate(coordinate: Unit, radius: Double, isMetric: Boolean): js.Array[String] = js.native
    def nearbyGPSCoordinate(coordinate: Unit, radius: Unit, isMetric: Boolean): js.Array[String] = js.native
    
    def ordinalDirection(): String = js.native
    def ordinalDirection(useAbbr: Boolean): String = js.native
    
    def secondaryAddress(): String = js.native
    
    def state(): String = js.native
    def state(useAbbr: Boolean): String = js.native
    
    def stateAbbr(): String = js.native
    
    def streetAddress(): String = js.native
    def streetAddress(useFullAddress: Boolean): String = js.native
    
    def streetName(): String = js.native
    
    def streetPrefix(): String = js.native
    
    def streetSuffix(): String = js.native
    
    def timeZone(): String = js.native
    
    def zipCode(): String = js.native
    def zipCode(format: String): String = js.native
    
    def zipCodeByState(state: String): String = js.native
  }
  
  trait Collation extends StObject {
    
    def collation(): String
    
    def column(): String
    
    def engine(): String
    
    def `type`(): String
  }
  object Collation {
    
    @scala.inline
    def apply(collation: () => String, column: () => String, engine: () => String, `type`: () => String): Collation = {
      val __obj = js.Dynamic.literal(collation = js.Any.fromFunction0(collation), column = js.Any.fromFunction0(column), engine = js.Any.fromFunction0(engine))
      __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
      __obj.asInstanceOf[Collation]
    }
    
    @scala.inline
    implicit class CollationMutableBuilder[Self <: Collation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollation(value: () => String): Self = StObject.set(x, "collation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setColumn(value: () => String): Self = StObject.set(x, "column", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEngine(value: () => String): Self = StObject.set(x, "engine", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: () => String): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Color extends StObject {
    
    def color(): String = js.native
    
    def department(): String = js.native
    
    def price(): String = js.native
    def price(min: Double): String = js.native
    def price(min: Double, max: Double): String = js.native
    def price(min: Double, max: Double, dec: Double): String = js.native
    def price(min: Double, max: Double, dec: Double, symbol: String): String = js.native
    def price(min: Double, max: Double, dec: Unit, symbol: String): String = js.native
    def price(min: Double, max: Unit, dec: Double): String = js.native
    def price(min: Double, max: Unit, dec: Double, symbol: String): String = js.native
    def price(min: Double, max: Unit, dec: Unit, symbol: String): String = js.native
    def price(min: Unit, max: Double): String = js.native
    def price(min: Unit, max: Double, dec: Double): String = js.native
    def price(min: Unit, max: Double, dec: Double, symbol: String): String = js.native
    def price(min: Unit, max: Double, dec: Unit, symbol: String): String = js.native
    def price(min: Unit, max: Unit, dec: Double): String = js.native
    def price(min: Unit, max: Unit, dec: Double, symbol: String): String = js.native
    def price(min: Unit, max: Unit, dec: Unit, symbol: String): String = js.native
    
    def product(): String = js.native
    
    def productAdjective(): String = js.native
    
    def productDescription(): String = js.native
    
    def productMaterial(): String = js.native
    
    def productName(): String = js.native
  }
  
  @js.native
  trait CommonFileExt extends StObject {
    
    def commonFileExt(): String = js.native
    
    def commonFileName(ext: String): String = js.native
    def commonFileName(ext: String, `type`: String): String = js.native
    
    def commonFileType(): String = js.native
    
    def directoryPath(): String = js.native
    
    def fileExt(mimeType: String): String = js.native
    
    def fileName(): String = js.native
    def fileName(ext: String): String = js.native
    def fileName(ext: String, `type`: String): String = js.native
    def fileName(ext: Unit, `type`: String): String = js.native
    
    def filePath(): String = js.native
    
    def fileType(): String = js.native
    
    def mimeType(): String = js.native
    
    def semver(): String = js.native
  }
  
  @js.native
  trait ContextualCard extends StObject {
    
    def contextualCard(): typings.faker.Faker.ContextualCard = js.native
    
    def createCard(): Card = js.native
    
    def createTransaction(): Transaction = js.native
    
    def mustache(
      str: String,
      data: StringDictionary[String | (js.Function2[/* substring */ String, /* repeated */ js.Any, String])]
    ): String = js.native
    
    def randomize(): String = js.native
    def randomize[T](array: js.Array[T]): T = js.native
    
    def regexpStyleStringParse(string: String): String = js.native
    
    def repeatString(string: String): String = js.native
    def repeatString(string: String, num: Double): String = js.native
    
    def replaceCreditCardSymbols(): String = js.native
    def replaceCreditCardSymbols(string: String): String = js.native
    def replaceCreditCardSymbols(string: String, symbol: String): String = js.native
    def replaceCreditCardSymbols(string: Unit, symbol: String): String = js.native
    
    def replaceSymbolWithNumber(): String = js.native
    def replaceSymbolWithNumber(string: String): String = js.native
    def replaceSymbolWithNumber(string: String, symbol: String): String = js.native
    def replaceSymbolWithNumber(string: Unit, symbol: String): String = js.native
    
    def replaceSymbols(): String = js.native
    def replaceSymbols(string: String): String = js.native
    
    def shuffle(): js.Array[String] = js.native
    def shuffle[T](o: js.Array[T]): js.Array[T] = js.native
    
    def slugify(): String = js.native
    def slugify(string: String): String = js.native
    
    def userCard(): UserCard = js.native
  }
  
  trait Count extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var upcase: js.UndefOr[Boolean] = js.undefined
  }
  object Count {
    
    @scala.inline
    def apply(): Count = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setUpcase(value: Boolean): Self = StObject.set(x, "upcase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpcaseUndefined: Self = StObject.set(x, "upcase", js.undefined)
    }
  }
  
  @js.native
  trait FindName extends StObject {
    
    def findName(): String = js.native
    def findName(firstName: String): String = js.native
    def findName(firstName: String, lastName: String): String = js.native
    def findName(firstName: String, lastName: String, gender: Double): String = js.native
    def findName(firstName: String, lastName: Unit, gender: Double): String = js.native
    def findName(firstName: Unit, lastName: String): String = js.native
    def findName(firstName: Unit, lastName: String, gender: Double): String = js.native
    def findName(firstName: Unit, lastName: Unit, gender: Double): String = js.native
    
    def firstName(): String = js.native
    def firstName(gender: Double): String = js.native
    
    def jobArea(): String = js.native
    
    def jobDescriptor(): String = js.native
    
    def jobTitle(): String = js.native
    
    def jobType(): String = js.native
    
    def lastName(): String = js.native
    def lastName(gender: Double): String = js.native
    
    def middleName(): String = js.native
    def middleName(gender: Double): String = js.native
    
    def prefix(): String = js.native
    
    def suffix(): String = js.native
    
    def title(): String = js.native
  }
  
  trait Fuel extends StObject {
    
    def color(): String
    
    def fuel(): String
    
    def manufacturer(): String
    
    def model(): String
    
    def `type`(): String
    
    def vehicle(): String
    
    def vin(): String
  }
  object Fuel {
    
    @scala.inline
    def apply(
      color: () => String,
      fuel: () => String,
      manufacturer: () => String,
      model: () => String,
      `type`: () => String,
      vehicle: () => String,
      vin: () => String
    ): Fuel = {
      val __obj = js.Dynamic.literal(color = js.Any.fromFunction0(color), fuel = js.Any.fromFunction0(fuel), manufacturer = js.Any.fromFunction0(manufacturer), model = js.Any.fromFunction0(model), vehicle = js.Any.fromFunction0(vehicle), vin = js.Any.fromFunction0(vin))
      __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
      __obj.asInstanceOf[Fuel]
    }
    
    @scala.inline
    implicit class FuelMutableBuilder[Self <: Fuel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: () => String): Self = StObject.set(x, "color", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFuel(value: () => String): Self = StObject.set(x, "fuel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setManufacturer(value: () => String): Self = StObject.set(x, "manufacturer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setModel(value: () => String): Self = StObject.set(x, "model", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: () => String): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVehicle(value: () => String): Self = StObject.set(x, "vehicle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVin(value: () => String): Self = StObject.set(x, "vin", js.Any.fromFunction0(value))
    }
  }
  
  trait Genre extends StObject {
    
    def genre(): String
  }
  object Genre {
    
    @scala.inline
    def apply(genre: () => String): Genre = {
      val __obj = js.Dynamic.literal(genre = js.Any.fromFunction0(genre))
      __obj.asInstanceOf[Genre]
    }
    
    @scala.inline
    implicit class GenreMutableBuilder[Self <: Genre] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGenre(value: () => String): Self = StObject.set(x, "genre", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Lines extends StObject {
    
    def lines(): String = js.native
    def lines(lineCount: Double): String = js.native
    
    def paragraph(): String = js.native
    def paragraph(sentenceCount: Double): String = js.native
    
    def paragraphs(): String = js.native
    def paragraphs(paragraphCount: Double): String = js.native
    def paragraphs(paragraphCount: Double, separator: String): String = js.native
    def paragraphs(paragraphCount: Unit, separator: String): String = js.native
    
    def sentence(): String = js.native
    def sentence(wordCount: Double): String = js.native
    def sentence(wordCount: Double, range: Double): String = js.native
    def sentence(wordCount: Unit, range: Double): String = js.native
    
    def sentences(): String = js.native
    def sentences(sentenceCount: Double): String = js.native
    
    def slug(): String = js.native
    def slug(wordCount: Double): String = js.native
    
    def text(): String = js.native
    def text(times: Double): String = js.native
    
    def word(): String = js.native
    def word(length: Double): String = js.native
    
    def words(): String = js.native
    def words(num: Double): String = js.native
  }
  
  trait Max extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
  }
  object Max {
    
    @scala.inline
    def apply(): Max = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    }
  }
  
  trait Merge extends StObject {
    
    var merge: Boolean
  }
  object Merge {
    
    @scala.inline
    def apply(merge: Boolean): Merge = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[Merge]
    }
    
    @scala.inline
    implicit class MergeMutableBuilder[Self <: Merge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PhoneFormats extends StObject {
    
    def phoneFormats(): String = js.native
    
    def phoneNumber(): String = js.native
    def phoneNumber(format: String): String = js.native
    
    def phoneNumberFormat(): String = js.native
    def phoneNumberFormat(phoneFormatsArrayIndex: Double): String = js.native
  }
  
  @js.native
  trait Recent extends StObject {
    
    def recent(): Double = js.native
    @JSName("recent")
    def recent_abbr(outputType: abbr): String = js.native
    @JSName("recent")
    def recent_unix(outputType: unix): Double = js.native
    @JSName("recent")
    def recent_wide(outputType: wide): String = js.native
  }
}
