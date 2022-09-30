package typings.gatsbyCli.anon

import typings.gatsbyCli.gatsbyCliBooleans.`false`
import typings.gatsbyCli.gatsbyCliStrings.bgBlack
import typings.gatsbyCli.gatsbyCliStrings.bgBlackBright
import typings.gatsbyCli.gatsbyCliStrings.bgBlue
import typings.gatsbyCli.gatsbyCliStrings.bgBlueBright
import typings.gatsbyCli.gatsbyCliStrings.bgCyan
import typings.gatsbyCli.gatsbyCliStrings.bgCyanBright
import typings.gatsbyCli.gatsbyCliStrings.bgGray
import typings.gatsbyCli.gatsbyCliStrings.bgGreen
import typings.gatsbyCli.gatsbyCliStrings.bgGreenBright
import typings.gatsbyCli.gatsbyCliStrings.bgGrey
import typings.gatsbyCli.gatsbyCliStrings.bgMagenta
import typings.gatsbyCli.gatsbyCliStrings.bgMagentaBright
import typings.gatsbyCli.gatsbyCliStrings.bgRed
import typings.gatsbyCli.gatsbyCliStrings.bgRedBright
import typings.gatsbyCli.gatsbyCliStrings.bgWhite
import typings.gatsbyCli.gatsbyCliStrings.bgWhiteBright
import typings.gatsbyCli.gatsbyCliStrings.bgYellow
import typings.gatsbyCli.gatsbyCliStrings.bgYellowBright
import typings.gatsbyCli.gatsbyCliStrings.black
import typings.gatsbyCli.gatsbyCliStrings.blackBright
import typings.gatsbyCli.gatsbyCliStrings.blue
import typings.gatsbyCli.gatsbyCliStrings.blueBright
import typings.gatsbyCli.gatsbyCliStrings.bold
import typings.gatsbyCli.gatsbyCliStrings.cyan
import typings.gatsbyCli.gatsbyCliStrings.cyanBright
import typings.gatsbyCli.gatsbyCliStrings.dim
import typings.gatsbyCli.gatsbyCliStrings.gray
import typings.gatsbyCli.gatsbyCliStrings.green
import typings.gatsbyCli.gatsbyCliStrings.greenBright
import typings.gatsbyCli.gatsbyCliStrings.grey
import typings.gatsbyCli.gatsbyCliStrings.hidden
import typings.gatsbyCli.gatsbyCliStrings.inverse
import typings.gatsbyCli.gatsbyCliStrings.italic
import typings.gatsbyCli.gatsbyCliStrings.magenta
import typings.gatsbyCli.gatsbyCliStrings.magentaBright
import typings.gatsbyCli.gatsbyCliStrings.red
import typings.gatsbyCli.gatsbyCliStrings.redBright
import typings.gatsbyCli.gatsbyCliStrings.reset
import typings.gatsbyCli.gatsbyCliStrings.strikethrough
import typings.gatsbyCli.gatsbyCliStrings.underline
import typings.gatsbyCli.gatsbyCliStrings.visible
import typings.gatsbyCli.gatsbyCliStrings.white
import typings.gatsbyCli.gatsbyCliStrings.whiteBright
import typings.gatsbyCli.gatsbyCliStrings.yellow
import typings.gatsbyCli.gatsbyCliStrings.yellowBright
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  var BackgroundColor: bgBlack | bgRed | bgGreen | bgYellow | bgBlue | bgMagenta | bgCyan | bgWhite | bgGray | bgGrey | bgBlackBright | bgRedBright | bgGreenBright | bgYellowBright | bgBlueBright | bgMagentaBright | bgCyanBright | bgWhiteBright
  
  var Color: red | white | black | green | yellow | blue | magenta | cyan | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright | bgBlack | bgRed | bgGreen | bgYellow | bgBlue | bgMagenta | bgCyan | bgWhite | bgGray | bgGrey | bgBlackBright | bgRedBright | bgGreenBright | bgYellowBright | bgBlueBright | bgMagentaBright | bgCyanBright | bgWhiteBright
  
  var ForegroundColor: red | white | black | green | yellow | blue | magenta | cyan | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright
  
  var Level: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Level */ Any
  
  var Modifiers: bold | underline | reset | dim | italic | inverse | hidden | strikethrough | visible
  
  var stderr: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any) & SupportsColor
  
  var supportsColor: `false` | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.ColorSupport */ Any)
}
object BackgroundColor {
  
  inline def apply(
    BackgroundColor: bgBlack | bgRed | bgGreen | bgYellow | bgBlue | bgMagenta | bgCyan | bgWhite | bgGray | bgGrey | bgBlackBright | bgRedBright | bgGreenBright | bgYellowBright | bgBlueBright | bgMagentaBright | bgCyanBright | bgWhiteBright,
    Color: red | white | black | green | yellow | blue | magenta | cyan | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright | bgBlack | bgRed | bgGreen | bgYellow | bgBlue | bgMagenta | bgCyan | bgWhite | bgGray | bgGrey | bgBlackBright | bgRedBright | bgGreenBright | bgYellowBright | bgBlueBright | bgMagentaBright | bgCyanBright | bgWhiteBright,
    ForegroundColor: red | white | black | green | yellow | blue | magenta | cyan | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright,
    Level: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Level */ Any,
    Modifiers: bold | underline | reset | dim | italic | inverse | hidden | strikethrough | visible,
    stderr: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any) & SupportsColor,
    supportsColor: `false` | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.ColorSupport */ Any)
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ForegroundColor = ForegroundColor.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], Modifiers = Modifiers.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], supportsColor = supportsColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  
  extension [Self <: BackgroundColor](x: Self) {
    
    inline def setBackgroundColor(
      value: bgBlack | bgRed | bgGreen | bgYellow | bgBlue | bgMagenta | bgCyan | bgWhite | bgGray | bgGrey | bgBlackBright | bgRedBright | bgGreenBright | bgYellowBright | bgBlueBright | bgMagentaBright | bgCyanBright | bgWhiteBright
    ): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setColor(
      value: red | white | black | green | yellow | blue | magenta | cyan | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright | bgBlack | bgRed | bgGreen | bgYellow | bgBlue | bgMagenta | bgCyan | bgWhite | bgGray | bgGrey | bgBlackBright | bgRedBright | bgGreenBright | bgYellowBright | bgBlueBright | bgMagentaBright | bgCyanBright | bgWhiteBright
    ): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setForegroundColor(
      value: red | white | black | green | yellow | blue | magenta | cyan | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright
    ): Self = StObject.set(x, "ForegroundColor", value.asInstanceOf[js.Any])
    
    inline def setLevel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Level */ Any
    ): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setModifiers(value: bold | underline | reset | dim | italic | inverse | hidden | strikethrough | visible): Self = StObject.set(x, "Modifiers", value.asInstanceOf[js.Any])
    
    inline def setStderr(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any) & SupportsColor
    ): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setSupportsColor(
      value: `false` | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.ColorSupport */ Any)
    ): Self = StObject.set(x, "supportsColor", value.asInstanceOf[js.Any])
  }
}
