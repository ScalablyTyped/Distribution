package typings
package atFirebaseDatabaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/util", JSImport.Namespace)
@js.native
object distSrcCoreUtilUtilMod extends js.Object {
  val `INTEGER_REGEXP_`: stdLib.RegExp = js.native
  val LUIDGenerator: js.Function0[scala.Double] = js.native
  val MAX_NAME: /* [MAX_NAME] */ java.lang.String = js.native
  val MIN_NAME: /* [MIN_NAME] */ java.lang.String = js.native
  val ObjectToUniqueKey: js.Function1[/* obj */ js.Any, java.lang.String] = js.native
  val beingCrawled: js.Function0[scala.Boolean] = js.native
  val bindCallback: js.Function2[
    /* callback */ js.Function1[/* a */ js.Any, scala.Unit], 
    /* context */ js.UndefOr[js.Object], 
    js.Function
  ] = js.native
  val callUserCallback: js.Function2[/* callback */ js.UndefOr[js.Function], /* repeated */js.Any, scala.Unit] = js.native
  val doubleToIEEE754String: js.Function1[/* v */ scala.Double, java.lang.String] = js.native
  val each: js.Function2[
    /* obj */ js.Object | js.Array[js.Any], 
    /* fn */ js.Function2[/* v */ js.UndefOr[js.Any], /* k */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ] = js.native
  val enableLogging: js.Function2[
    /* logger_ */ js.UndefOr[scala.Boolean | (js.Function1[/* a */ java.lang.String, scala.Unit])], 
    /* persistent */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ] = js.native
  val error: js.Function1[/* repeated */java.lang.String, scala.Unit] = js.native
  val errorForServerCode: js.Function2[
    /* code */ java.lang.String, 
    /* query */ atFirebaseDatabaseLib.distSrcApiQueryMod.Query, 
    stdLib.Error
  ] = js.native
  val exceptionGuard: js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit] = js.native
  val executeWhenDOMReady: js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit] = js.native
  val exportPropGetter: js.Function3[
    /* object */ js.Object, 
    /* name */ java.lang.String, 
    /* fnGet */ js.Function0[js.Any], 
    scala.Unit
  ] = js.native
  val fatal: js.Function1[/* repeated */java.lang.String, scala.Nothing] = js.native
  val isChromeExtensionContentScript: js.Function0[scala.Boolean] = js.native
  val isInvalidJSONNumber: js.Function1[/* data */ js.Any, scala.Boolean] = js.native
  val isWindowsStoreApp: js.Function0[scala.Boolean] = js.native
  val log: js.Function1[/* repeated */java.lang.String, scala.Unit] = js.native
  val logWrapper: js.Function1[/* prefix */ java.lang.String, js.Function1[/* repeated */js.Any, scala.Unit]] = js.native
  var logger: (js.Function1[/* a */ java.lang.String, scala.Unit]) | scala.Null = js.native
  val nameCompare: js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Double] = js.native
  val requireKey: js.Function2[
    /* key */ java.lang.String, 
    /* obj */ ScalablyTyped.runtime.StringDictionary[js.Any], 
    js.Any
  ] = js.native
  val setTimeoutNonBlocking: js.Function2[/* fn */ js.Function, /* time */ scala.Double, scala.Double | js.Object] = js.native
  val sha1: js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  val splitStringBySize: js.Function2[/* str */ java.lang.String, /* segsize */ scala.Double, js.Array[java.lang.String]] = js.native
  val stringCompare: js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Double] = js.native
  val tryParseInt: js.Function1[/* str */ java.lang.String, scala.Double] = js.native
  val warn: js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  val warnAboutUnsupportedMethod: js.Function1[/* methodName */ java.lang.String, scala.Unit] = js.native
  val warnIfPageIsSecure: js.Function0[scala.Unit] = js.native
}

