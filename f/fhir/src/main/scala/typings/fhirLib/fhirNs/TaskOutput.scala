package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information produced as part of task
  */
trait TaskOutput extends BackboneElement {
  /**
    * Contains extended information for property 'valueBase64Binary'.
    */
  var _valueBase64Binary: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDate'.
    */
  var _valueDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueId'.
    */
  var _valueId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueInstant'.
    */
  var _valueInstant: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueMarkdown'.
    */
  var _valueMarkdown: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueOid'.
    */
  var _valueOid: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valuePositiveInt'.
    */
  var _valuePositiveInt: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueUnsignedInt'.
    */
  var _valueUnsignedInt: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueUri'.
    */
  var _valueUri: js.UndefOr[Element] = js.undefined
  /**
    * Label for output
    */
  var `type`: CodeableConcept
  /**
    * Result of output
    */
  var valueAddress: js.UndefOr[Address] = js.undefined
  /**
    * Result of output
    */
  var valueAge: js.UndefOr[Age] = js.undefined
  /**
    * Result of output
    */
  var valueAnnotation: js.UndefOr[Annotation] = js.undefined
  /**
    * Result of output
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Result of output
    */
  var valueBase64Binary: js.UndefOr[base64Binary] = js.undefined
  /**
    * Result of output
    */
  var valueBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Result of output
    */
  var valueCode: js.UndefOr[code] = js.undefined
  /**
    * Result of output
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Result of output
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  /**
    * Result of output
    */
  var valueContactPoint: js.UndefOr[ContactPoint] = js.undefined
  /**
    * Result of output
    */
  var valueCount: js.UndefOr[Count] = js.undefined
  /**
    * Result of output
    */
  var valueDate: js.UndefOr[date] = js.undefined
  /**
    * Result of output
    */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Result of output
    */
  var valueDecimal: js.UndefOr[decimal] = js.undefined
  /**
    * Result of output
    */
  var valueDistance: js.UndefOr[Distance] = js.undefined
  /**
    * Result of output
    */
  var valueDuration: js.UndefOr[Duration] = js.undefined
  /**
    * Result of output
    */
  var valueHumanName: js.UndefOr[HumanName] = js.undefined
  /**
    * Result of output
    */
  var valueId: js.UndefOr[id] = js.undefined
  /**
    * Result of output
    */
  var valueIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Result of output
    */
  var valueInstant: js.UndefOr[instant] = js.undefined
  /**
    * Result of output
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
    * Result of output
    */
  var valueMarkdown: js.UndefOr[markdown] = js.undefined
  /**
    * Result of output
    */
  var valueMeta: js.UndefOr[Meta] = js.undefined
  /**
    * Result of output
    */
  var valueMoney: js.UndefOr[Money] = js.undefined
  /**
    * Result of output
    */
  var valueOid: js.UndefOr[oid] = js.undefined
  /**
    * Result of output
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  /**
    * Result of output
    */
  var valuePositiveInt: js.UndefOr[positiveInt] = js.undefined
  /**
    * Result of output
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Result of output
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  /**
    * Result of output
    */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  /**
    * Result of output
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  /**
    * Result of output
    */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  /**
    * Result of output
    */
  var valueSignature: js.UndefOr[Signature] = js.undefined
  /**
    * Result of output
    */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Result of output
    */
  var valueTime: js.UndefOr[time] = js.undefined
  /**
    * Result of output
    */
  var valueTiming: js.UndefOr[Timing] = js.undefined
  /**
    * Result of output
    */
  var valueUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Result of output
    */
  var valueUri: js.UndefOr[uri] = js.undefined
}

