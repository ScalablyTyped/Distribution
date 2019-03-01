package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirclesResource extends js.Object {
  /** Add a person to a circle. Google+ limits certain circle operations, including the number of circle adds. Learn More. */
  def addPeople(request: gapiDotClientDotPlusdomainsLib.Anon_AltCircleId): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
  /** Get a circle. */
  def get(request: gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
  /** Create a new circle for the authenticated user. */
  def insert(request: gapiDotClientDotPlusdomainsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
  /** List all of the circles for a user. */
  def list(request: gapiDotClientDotPlusdomainsLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[CircleFeed]
  /** Update a circle's description. This method supports patch semantics. */
  def patch(request: gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
  /** Delete a circle. */
  def remove(request: gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Remove a person from a circle. */
  def removePeople(request: gapiDotClientDotPlusdomainsLib.Anon_AltCircleId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Update a circle's description. */
  def update(request: gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
}

object CirclesResource {
  @scala.inline
  def apply(
    addPeople: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_AltCircleId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Circle]
    ],
    get: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Circle]
    ],
    insert: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Circle]
    ],
    list: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[CircleFeed]
    ],
    patch: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Circle]
    ],
    remove: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    removePeople: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_AltCircleId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    update: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Circle]
    ]
  ): CirclesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addPeople")(addPeople)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removePeople")(removePeople)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[CirclesResource]
  }
}

