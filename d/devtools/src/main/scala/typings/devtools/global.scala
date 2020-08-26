package typings.devtools

import typings.devtools.DevTools.Client
import typings.webdriver.WebDriver.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object DevTools extends js.Object {
    def newSession(): js.Promise[Client] = js.native
    def newSession(
      options: js.UndefOr[scala.Nothing],
      modifier: js.UndefOr[scala.Nothing],
      proto: js.UndefOr[scala.Nothing],
      commandWrapper: js.Function2[/* commandName */ String, /* fn */ js.Function1[/* repeated */ js.Any, _], _]
    ): js.Promise[Client] = js.native
    def newSession(options: js.UndefOr[scala.Nothing], modifier: js.UndefOr[scala.Nothing], proto: js.Object): js.Promise[Client] = js.native
    def newSession(
      options: js.UndefOr[scala.Nothing],
      modifier: js.UndefOr[scala.Nothing],
      proto: js.Object,
      commandWrapper: js.Function2[/* commandName */ String, /* fn */ js.Function1[/* repeated */ js.Any, _], _]
    ): js.Promise[Client] = js.native
    def newSession(options: js.UndefOr[scala.Nothing], modifier: js.Function1[/* repeated */ js.Any, _]): js.Promise[Client] = js.native
    def newSession(
      options: js.UndefOr[scala.Nothing],
      modifier: js.Function1[/* repeated */ js.Any, _],
      proto: js.UndefOr[scala.Nothing],
      commandWrapper: js.Function2[/* commandName */ String, /* fn */ js.Function1[/* repeated */ js.Any, _], _]
    ): js.Promise[Client] = js.native
    def newSession(
      options: js.UndefOr[scala.Nothing],
      modifier: js.Function1[/* repeated */ js.Any, _],
      proto: js.Object
    ): js.Promise[Client] = js.native
    def newSession(
      options: js.UndefOr[scala.Nothing],
      modifier: js.Function1[/* repeated */ js.Any, _],
      proto: js.Object,
      commandWrapper: js.Function2[/* commandName */ String, /* fn */ js.Function1[/* repeated */ js.Any, _], _]
    ): js.Promise[Client] = js.native
    def newSession(options: Options): js.Promise[Client] = js.native
    def newSession(
      options: Options,
      modifier: js.UndefOr[scala.Nothing],
      proto: js.UndefOr[scala.Nothing],
      commandWrapper: js.Function2[/* commandName */ String, /* fn */ js.Function1[/* repeated */ js.Any, _], _]
    ): js.Promise[Client] = js.native
    def newSession(options: Options, modifier: js.UndefOr[scala.Nothing], proto: js.Object): js.Promise[Client] = js.native
    def newSession(
      options: Options,
      modifier: js.UndefOr[scala.Nothing],
      proto: js.Object,
      commandWrapper: js.Function2[/* commandName */ String, /* fn */ js.Function1[/* repeated */ js.Any, _], _]
    ): js.Promise[Client] = js.native
    def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, _]): js.Promise[Client] = js.native
    def newSession(
      options: Options,
      modifier: js.Function1[/* repeated */ js.Any, _],
      proto: js.UndefOr[scala.Nothing],
      commandWrapper: js.Function2[/* commandName */ String, /* fn */ js.Function1[/* repeated */ js.Any, _], _]
    ): js.Promise[Client] = js.native
    def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, _], proto: js.Object): js.Promise[Client] = js.native
    def newSession(
      options: Options,
      modifier: js.Function1[/* repeated */ js.Any, _],
      proto: js.Object,
      commandWrapper: js.Function2[/* commandName */ String, /* fn */ js.Function1[/* repeated */ js.Any, _], _]
    ): js.Promise[Client] = js.native
    def reloadSession(instance: Client): js.Promise[Client] = js.native
  }
  
}

