package typings
package atFirebaseDatabaseLib.atFirebaseDatabaseMod.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var database: js.UndefOr[
    js.Function1[
      /* databaseURL */ js.UndefOr[java.lang.String], 
      atFirebaseDatabaseDashTypesLib.atFirebaseDatabaseDashTypesMod.FirebaseDatabase
    ]
  ] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(
    database: /* databaseURL */ js.UndefOr[java.lang.String] => atFirebaseDatabaseDashTypesLib.atFirebaseDatabaseDashTypesMod.FirebaseDatabase = null
  ): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(js.Any.fromFunction1(database))
    __obj.asInstanceOf[FirebaseApp]
  }
}

