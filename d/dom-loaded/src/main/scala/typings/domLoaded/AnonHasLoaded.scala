package typings.domLoaded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHasLoaded extends js.Object {
  /**
  	Synchronously check if the DOM has already finished loaded.
  	```
  	import domLoaded = require('dom-loaded');
  	if (domLoaded.hasLoaded) {
  		console.log('The DOM has already finished loading.')
  	}
  	```
  	*/
  var hasLoaded: Boolean
}

object AnonHasLoaded {
  @scala.inline
  def apply(hasLoaded: Boolean): AnonHasLoaded = {
    val __obj = js.Dynamic.literal(hasLoaded = hasLoaded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHasLoaded]
  }
}

