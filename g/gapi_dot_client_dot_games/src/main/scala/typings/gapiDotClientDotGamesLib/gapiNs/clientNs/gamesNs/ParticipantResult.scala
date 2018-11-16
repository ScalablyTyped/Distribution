package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ParticipantResult extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#participantResult. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the participant. */
  var participantId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The placement or ranking of the participant in the match results; a number from one to the number of participants in the match. Multiple participants
               * may have the same placing value in case of a type.
               */
  var placing: js.UndefOr[scala.Double] = js.undefined
  /**
               * The result of the participant for this match.
               * Possible values are:
               * - "MATCH_RESULT_WIN" - The participant won the match.
               * - "MATCH_RESULT_LOSS" - The participant lost the match.
               * - "MATCH_RESULT_TIE" - The participant tied the match.
               * - "MATCH_RESULT_NONE" - There was no winner for the match (nobody wins or loses this kind of game.)
               * - "MATCH_RESULT_DISCONNECT" - The participant disconnected / left during the match.
               * - "MATCH_RESULT_DISAGREED" - Different clients reported different results for this participant.
               */
  var result: js.UndefOr[java.lang.String] = js.undefined
}

