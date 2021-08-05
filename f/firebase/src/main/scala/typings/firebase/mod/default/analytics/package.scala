package typings.firebase.mod.default.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Gets the {@link firebase.analytics.Analytics `Analytics`} service.
  *
  * `firebase.analytics()` can be called with no arguments to access the default
  * app's {@link firebase.analytics.Analytics `Analytics`} service.
  *
  * @webonly
  *
  * @example
  * ```javascript
  * // Get the Analytics service for the default app
  * const defaultAnalytics = firebase.analytics();
  * ```
  *
  * @param app The app to create an analytics service for.
  * If not passed, uses the default app.
  */
inline def apply(): typings.firebase.mod.firebase.analytics.Analytics = typings.firebase.mod.default.analytics.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.firebase.mod.firebase.analytics.Analytics]
inline def apply(app: typings.firebase.mod.firebase.app.App): typings.firebase.mod.firebase.analytics.Analytics = typings.firebase.mod.default.analytics.^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.analytics.Analytics]

/**
  * An async function that returns true if current browser context supports initialization of analytics module
  * (`firebase.analytics()`).
  *
  * Returns false otherwise.
  *
  *
  */
inline def isSupported(): js.Promise[scala.Boolean] = typings.firebase.mod.default.analytics.^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[scala.Boolean]]

inline def settings(settings: typings.firebase.mod.firebase.analytics.SettingsOptions): scala.Unit = typings.firebase.mod.default.analytics.^.asInstanceOf[js.Dynamic].applyDynamic("settings")(settings.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

type Currency = java.lang.String | scala.Double

type CustomEventName[T] = T

type CustomParams = org.scalablytyped.runtime.StringDictionary[js.Any]
