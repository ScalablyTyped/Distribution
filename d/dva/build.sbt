organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-41ca93"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.4-b274af",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-0e3323",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190520Z-336e99",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190520Z-dbea1f",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20190506Z-a3b3fd",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20190212Z-d7f07d",
  "org.scalablytyped" %%% "redux" % "4.0.1-76f17e",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        