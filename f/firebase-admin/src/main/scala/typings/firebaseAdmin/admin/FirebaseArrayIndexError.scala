package typings.firebaseAdmin.admin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Composite type which includes both a `FirebaseError` object and an index
  * which can be used to get the errored item.
  *
  * @example
  * ```javascript
  * var registrationTokens = [token1, token2, token3];
  * admin.messaging().subscribeToTopic(registrationTokens, 'topic-name')
  *   .then(function(response) {
  *     if (response.failureCount > 0) {
  *       console.log("Following devices unsucessfully subscribed to topic:");
  *       response.errors.forEach(function(error) {
  *         var invalidToken = registrationTokens[error.index];
  *         console.log(invalidToken, error.error);
  *       });
  *     } else {
  *       console.log("All devices successfully subscribed to topic:", response);
  *     }
  *   })
  *   .catch(function(error) {
  *     console.log("Error subscribing to topic:", error);
  *   });
  *```
  */
trait FirebaseArrayIndexError extends js.Object {
  /**
    * The error object.
    */
  var error: FirebaseError
  /**
    * The index of the errored item within the original array passed as part of the
    * called API method.
    */
  var index: Double
}

object FirebaseArrayIndexError {
  @scala.inline
  def apply(error: FirebaseError, index: Double): FirebaseArrayIndexError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirebaseArrayIndexError]
  }
}

