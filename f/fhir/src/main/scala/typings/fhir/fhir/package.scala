package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * A duration of time during which an organism (or a process) has existed
  */
type Age = typings.fhir.fhir.Quantity

/**
  * A measured or measurable amount
  */
type Count = typings.fhir.fhir.Quantity

/**
  * A length - a value with a unit that is a physical distance
  */
type Distance = typings.fhir.fhir.Quantity

/**
  * A length of time
  */
type Duration = typings.fhir.fhir.Quantity

/**
  * An amount of economic utility in some recognized currency
  */
type Money = typings.fhir.fhir.Quantity

/**
  * A fixed quantity (no comparator)
  */
type SimpleQuantity = typings.fhir.fhir.Quantity

/**
  * A stream of bytes
  */
type base64Binary = java.lang.String

/**
  * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
  */
type code = java.lang.String

/**
  * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
  */
type date = java.lang.String

/**
  * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
  */
type dateTime = java.lang.String

/**
  * A rational number with implicit precision
  */
type decimal = scala.Double

/**
  * Any combination of letters, numerals, "-" and ".", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
  */
type id = java.lang.String

/**
  * An instant in time - known at least to the second
  */
type instant = java.lang.String

/**
  * A whole number
  */
type integer = scala.Double

/**
  * A string that may contain markdown syntax for optional processing by a mark down presentation engine
  */
type markdown = java.lang.String

/**
  * An OID represented as a URI
  */
type oid = java.lang.String

/**
  * An integer with a value that is positive (e.g. >0)
  */
type positiveInt = scala.Double

/**
  * A time during the day, with no date specified
  */
type time = java.lang.String

/**
  * An integer with a value that is not negative (e.g. >= 0)
  */
type unsignedInt = scala.Double

/**
  * String of characters used to identify a name or a resource
  */
type uri = java.lang.String
