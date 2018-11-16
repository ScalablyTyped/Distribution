package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Information used to perform task
     */

trait TaskInput extends BackboneElement {
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
           * Label for the input
           */
  var `type`: CodeableConcept
  /**
           * Content to use in performing the task
           */
  var valueAddress: js.UndefOr[Address] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueAge: js.UndefOr[Age] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueAnnotation: js.UndefOr[Annotation] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueBase64Binary: js.UndefOr[base64Binary] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueCode: js.UndefOr[code] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueContactPoint: js.UndefOr[ContactPoint] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueCount: js.UndefOr[Count] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueDate: js.UndefOr[date] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueDecimal: js.UndefOr[decimal] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueDistance: js.UndefOr[Distance] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueDuration: js.UndefOr[Duration] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueHumanName: js.UndefOr[HumanName] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueId: js.UndefOr[id] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueInstant: js.UndefOr[instant] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueMarkdown: js.UndefOr[markdown] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueMeta: js.UndefOr[Meta] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueMoney: js.UndefOr[Money] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueOid: js.UndefOr[oid] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valuePositiveInt: js.UndefOr[positiveInt] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueRange: js.UndefOr[Range] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueReference: js.UndefOr[Reference] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueSignature: js.UndefOr[Signature] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueTime: js.UndefOr[time] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueTiming: js.UndefOr[Timing] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
  /**
           * Content to use in performing the task
           */
  var valueUri: js.UndefOr[uri] = js.undefined
}

