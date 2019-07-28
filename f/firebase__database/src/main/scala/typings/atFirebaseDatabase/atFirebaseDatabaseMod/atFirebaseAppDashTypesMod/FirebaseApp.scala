package typings.atFirebaseDatabase.atFirebaseDatabaseMod.atFirebaseAppDashTypesMod

import typings.atFirebaseDatabaseDashTypes.atFirebaseDatabaseDashTypesMod.FirebaseDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var database: js.UndefOr[js.Function1[/* databaseURL */ js.UndefOr[String], FirebaseDatabase]] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(database: /* databaseURL */ js.UndefOr[String] => FirebaseDatabase = null): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(js.Any.fromFunction1(database))
    __obj.asInstanceOf[FirebaseApp]
  }
}

