package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Operation Parameter
  */
trait ParametersParameter extends BackboneElement {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
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
    * Name from the definition
    */
  var name: java.lang.String
  /**
    * Named part of a multi-part parameter
    */
  var part: js.UndefOr[js.Array[ParametersParameter]] = js.undefined
  /**
    * If parameter is a whole resource
    */
  var resource: js.UndefOr[Resource] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueAddress: js.UndefOr[Address] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueAge: js.UndefOr[Age] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueAnnotation: js.UndefOr[Annotation] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueBase64Binary: js.UndefOr[base64Binary] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueCode: js.UndefOr[code] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueContactPoint: js.UndefOr[ContactPoint] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueCount: js.UndefOr[Count] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueDate: js.UndefOr[date] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueDecimal: js.UndefOr[decimal] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueDistance: js.UndefOr[Distance] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueDuration: js.UndefOr[Duration] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueHumanName: js.UndefOr[HumanName] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueId: js.UndefOr[id] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueInstant: js.UndefOr[instant] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueMarkdown: js.UndefOr[markdown] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueMeta: js.UndefOr[Meta] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueMoney: js.UndefOr[Money] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueOid: js.UndefOr[oid] = js.undefined
  /**
    * If parameter is a data type
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  /**
    * If parameter is a data type
    */
  var valuePositiveInt: js.UndefOr[positiveInt] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueSignature: js.UndefOr[Signature] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueTime: js.UndefOr[time] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueTiming: js.UndefOr[Timing] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
  /**
    * If parameter is a data type
    */
  var valueUri: js.UndefOr[uri] = js.undefined
}

