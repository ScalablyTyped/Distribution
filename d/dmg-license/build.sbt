organization := "org.scalablytyped"
name := "dmg-license"
version := "1.0.11-0db400"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "iconv-corefoundation" % "1.1.7-f381ba",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20220624Z-e917ec",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "verror" % "1.10-dt-20220720Z-97572a",
  "org.scalablytyped" %%% "xmlbuilder" % "15.1.1-35ce0e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
