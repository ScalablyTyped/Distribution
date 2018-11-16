package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListPopulationTerm extends js.Object {
  /**
               * Will be true if the term should check if the user is in the list and false if the term should check if the user is not in the list. This field is only
               * relevant when type is set to LIST_MEMBERSHIP_TERM. False by default.
               */
  var contains: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Whether to negate the comparison result of this term during rule evaluation. This field is only relevant when type is left unset or set to
               * CUSTOM_VARIABLE_TERM or REFERRER_TERM.
               */
  var negation: js.UndefOr[scala.Boolean] = js.undefined
  /** Comparison operator of this term. This field is only relevant when type is left unset or set to CUSTOM_VARIABLE_TERM or REFERRER_TERM. */
  var operator: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the list in question. This field is only relevant when type is set to LIST_MEMBERSHIP_TERM. */
  var remarketingListId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * List population term type determines the applicable fields in this object. If left unset or set to CUSTOM_VARIABLE_TERM, then variableName,
               * variableFriendlyName, operator, value, and negation are applicable. If set to LIST_MEMBERSHIP_TERM then remarketingListId and contains are applicable.
               * If set to REFERRER_TERM then operator, value, and negation are applicable.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Literal to compare the variable to. This field is only relevant when type is left unset or set to CUSTOM_VARIABLE_TERM or REFERRER_TERM. */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Friendly name of this term's variable. This is a read-only, auto-generated field. This field is only relevant when type is left unset or set to
               * CUSTOM_VARIABLE_TERM.
               */
  var variableFriendlyName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Name of the variable (U1, U2, etc.) being compared in this term. This field is only relevant when type is set to null, CUSTOM_VARIABLE_TERM or
               * REFERRER_TERM.
               */
  var variableName: js.UndefOr[java.lang.String] = js.undefined
}

