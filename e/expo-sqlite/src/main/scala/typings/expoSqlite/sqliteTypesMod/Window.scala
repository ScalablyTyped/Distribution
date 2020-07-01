package typings.expoSqlite.sqliteTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var openDatabase: js.UndefOr[
    js.Function5[
      /* name */ String, 
      /* version */ String, 
      /* displayName */ String, 
      /* estimatedSize */ Double, 
      /* creationCallback */ js.UndefOr[DatabaseCallback], 
      Database
    ]
  ] = js.undefined
}

object Window {
  @scala.inline
  def apply(
    openDatabase: (/* name */ String, /* version */ String, /* displayName */ String, /* estimatedSize */ Double, /* creationCallback */ js.UndefOr[DatabaseCallback]) => Database = null
  ): Window = {
    val __obj = js.Dynamic.literal()
    if (openDatabase != null) __obj.updateDynamic("openDatabase")(js.Any.fromFunction5(openDatabase))
    __obj.asInstanceOf[Window]
  }
}

