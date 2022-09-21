package typings.djangoBananas.mod

import typings.djangoBananas.anon.RequestInterceptor
import typings.djangoBananas.mod.^
import typings.react.mod.Context
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def AdminContext: Context[AdminInterface] = ^.asInstanceOf[js.Dynamic].selectDynamic("AdminContext").asInstanceOf[Context[AdminInterface]]
type AdminContext = Context[AdminInterface]

inline def TitleBar: FC[TitleBarProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("TitleBar").asInstanceOf[FC[TitleBarProps]]

inline def Translate: FC[TranslateProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("Translate").asInstanceOf[FC[TranslateProps]]

inline def t(s: String, params: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(s.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]

inline def useAdmin(context: typings.djangoBananas.mod.AdminContext): AdminInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("useAdmin")(context.asInstanceOf[js.Any]).asInstanceOf[AdminInterface]

inline def usePage[T](context: PageContext[T]): PageContext[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePage")(context.asInstanceOf[js.Any]).asInstanceOf[PageContext[T]]

type ApiSetting = String | RequestInterceptor

type PageContext[T] = Context[PageInterface[T]]
