package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressComponent[T] extends js.Object {
  /** is the full text description or name of the address component as returned by the Geocoder. */
  var long_name: String = js.native
  /**
    * is an abbreviated textual name for the address component, if available.
    * For example, an address component for the state of Alaska may have a `long_name` of "Alaska" and a `short_name` of "AK"
    * using the 2-letter postal abbreviation.
    */
  var short_name: String = js.native
  /** is an array indicating the *type* of the address component. */
  var types: js.Array[T] = js.native
}

object AddressComponent {
  @scala.inline
  def apply[T](long_name: String, short_name: String, types: js.Array[T]): AddressComponent[T] = {
    val __obj = js.Dynamic.literal(long_name = long_name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressComponent[T]]
  }
  @scala.inline
  implicit class AddressComponentOps[Self <: AddressComponent[_], T] (val x: Self with AddressComponent[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLong_name(value: String): Self = this.set("long_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort_name(value: String): Self = this.set("short_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: T*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[T]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

