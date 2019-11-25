package typings.domDashLoaded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HasLoaded extends js.Object {
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

object Anon_HasLoaded {
  @scala.inline
  def apply(hasLoaded: Boolean): Anon_HasLoaded = {
    val __obj = js.Dynamic.literal(hasLoaded = hasLoaded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HasLoaded]
  }
}

