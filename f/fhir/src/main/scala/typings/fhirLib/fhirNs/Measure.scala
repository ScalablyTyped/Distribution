package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A quality measure definition
  */
trait Measure extends DomainResource {
  /**
    * Contains extended information for property 'approvalDate'.
    */
  var _approvalDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'clinicalRecommendationStatement'.
    */
  var _clinicalRecommendationStatement: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'disclaimer'.
    */
  var _disclaimer: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'guidance'.
    */
  var _guidance: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'improvementNotation'.
    */
  var _improvementNotation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'lastReviewDate'.
    */
  var _lastReviewDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'rateAggregation'.
    */
  var _rateAggregation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'rationale'.
    */
  var _rationale: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'riskAdjustment'.
    */
  var _riskAdjustment: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'set'.
    */
  var _set: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'usage'.
    */
  var _usage: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * When the measure was approved by publisher
    */
  var approvalDate: js.UndefOr[date] = js.undefined
  /**
    * Summary of clinical guidelines
    */
  var clinicalRecommendationStatement: js.UndefOr[markdown] = js.undefined
  /**
    * opportunity | all-or-nothing | linear | weighted
    */
  var compositeScoring: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * A content contributor
    */
  var contributor: js.UndefOr[js.Array[Contributor]] = js.undefined
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.undefined
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Defined terms used in the measure documentation
    */
  var definition: js.UndefOr[js.Array[markdown]] = js.undefined
  /**
    * Natural language description of the measure
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * Disclaimer for use of the measure or its referenced content
    */
  var disclaimer: js.UndefOr[markdown] = js.undefined
  /**
    * When the measure is expected to be used
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Population criteria group
    */
  var group: js.UndefOr[js.Array[MeasureGroup]] = js.undefined
  /**
    * Additional guidance for implementers
    */
  var guidance: js.UndefOr[markdown] = js.undefined
  /**
    * Additional identifier for the measure
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Improvement notation for the measure, e.g. higher score indicates better quality
    */
  var improvementNotation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Intended jurisdiction for measure (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * When the measure was last reviewed
    */
  var lastReviewDate: js.UndefOr[date] = js.undefined
  /**
    * Logic used by the measure
    */
  var library: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Name for this measure (computer friendly)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Why this measure is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * How is rate aggregation performed for this measure
    */
  var rateAggregation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Why does this measure exist
    */
  var rationale: js.UndefOr[markdown] = js.undefined
  /**
    * Additional documentation, citations, etc
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  /**
    * How is risk adjustment applied for this measure
    */
  var riskAdjustment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * proportion | ratio | continuous-variable | cohort
    */
  var scoring: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The measure set, e.g. Preventive Care and Screening
    */
  var set: js.UndefOr[java.lang.String] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * What other data should be reported with the measure
    */
  var supplementalData: js.UndefOr[js.Array[MeasureSupplementalData]] = js.undefined
  /**
    * Name for this measure (human friendly)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * E.g. Education, Treatment, Assessment, etc
    */
  var topic: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * process | outcome | structure | patient-reported-outcome | composite
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Logical URI to reference this measure (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  /**
    * Describes the clinical usage of the measure
    */
  var usage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Business version of the measure
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

