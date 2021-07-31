package typings.devtools

import typings.devtools.DevTools.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object DevTools {
    
    @JSGlobal("DevTools")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def newSession(): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")().asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any
    ): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any,
      modifier: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      proto: js.Object
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      proto: js.Object,
      commandWrapper: js.Function2[
          /* commandName */ String, 
          /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
          js.Any
        ]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      proto: Unit,
      commandWrapper: js.Function2[
          /* commandName */ String, 
          /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
          js.Any
        ]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any,
      modifier: Unit,
      proto: js.Object
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any,
      modifier: Unit,
      proto: js.Object,
      commandWrapper: js.Function2[
          /* commandName */ String, 
          /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
          js.Any
        ]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any,
      modifier: Unit,
      proto: Unit,
      commandWrapper: js.Function2[
          /* commandName */ String, 
          /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
          js.Any
        ]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any]): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any], proto: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      proto: js.Object,
      commandWrapper: js.Function2[
          /* commandName */ String, 
          /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
          js.Any
        ]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      proto: Unit,
      commandWrapper: js.Function2[
          /* commandName */ String, 
          /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
          js.Any
        ]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(options: Unit, modifier: Unit, proto: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: Unit,
      modifier: Unit,
      proto: js.Object,
      commandWrapper: js.Function2[
          /* commandName */ String, 
          /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
          js.Any
        ]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: Unit,
      modifier: Unit,
      proto: Unit,
      commandWrapper: js.Function2[
          /* commandName */ String, 
          /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
          js.Any
        ]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    
    @scala.inline
    def reloadSession(instance: Client): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadSession")(instance.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
  }
}
